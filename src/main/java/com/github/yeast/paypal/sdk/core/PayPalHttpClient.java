package com.github.yeast.paypal.sdk.core;

import com.github.yeast.paypal.sdk.core.object.AccessToken;
import com.github.yeast.paypal.sdk.core.request.AccessTokenRequest;
import com.github.yeast.paypal.sdk.core.request.RefreshTokenRequest;
import com.paypal.http.HttpClient;
import com.paypal.http.HttpRequest;

import java.io.IOException;

import static com.paypal.http.Headers.ACCEPT_ENCODING;
import static com.paypal.http.Headers.AUTHORIZATION;

// 代码在AuthorizationProvider，每次PayPalHttpClient 发出请求的时候都会去验证是否有auth
// 并且去加上 auth，加上 auth 这个过程每次都会去内存中取之前的 AccessToken 且判断是否过期，过期了之后会自行发起请求
// 所有唯一的一个 client 也不是不行
public class PayPalHttpClient extends HttpClient {

	private String refreshToken;

	public PayPalHttpClient(PayPalEnvironment environment) {
		super(environment);
		this.addInjector(this::addGzipHeader);
		this.addInjector(this::signRequest);
		this.addInjector(this::addFPTIHeaders);

	}

	public PayPalHttpClient(PayPalEnvironment environment, String refreshToken) {
		this(environment);
		this.refreshToken = refreshToken;
	}

	@Override
	protected String getUserAgent() {
		return UserAgent.USER_AGENT;
	}

	private void signRequest(HttpRequest request) throws IOException {
		if (!hasAuthHeader(request) && !isAuthRequest(request)) {
			AccessToken accessToken = AuthorizationProvider.sharedInstance().authorize(this, refreshToken);
			request.header(AUTHORIZATION, accessToken.authorizationString());
		}
	}

	private void addFPTIHeaders(HttpRequest request) throws IOException {
		request.header("sdk_name", "Checkout SDK");
		request.header("sdk_version", "1.0.5");
		request.header("sdk_tech_stack", "Java " + System.getProperty("java.version"));
		request.header("api_integration_type", "PAYPALSDK");
	}

	private void addGzipHeader(HttpRequest request) throws IOException {
		request.headers().headerIfNotPresent(ACCEPT_ENCODING, "gzip");
	}

	private boolean isAuthRequest(HttpRequest request) {
		return request instanceof AccessTokenRequest || request instanceof RefreshTokenRequest;
	}

	private boolean hasAuthHeader(HttpRequest request) {
		return request.headers().header(AUTHORIZATION) != null;
	}

	PayPalEnvironment getPayPalEnvironment() {
		return (PayPalEnvironment) super.getEnvironment();
	}
}
