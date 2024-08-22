package com.github.yeast.paypal.service;

import com.github.yeast.paypal.sdk.core.PayPalEnvironment;
import com.github.yeast.paypal.sdk.core.PayPalHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PayPalClient {

	@Value("${paypal.client.id}")
	private String clientId;

	@Value("${paypal.client.secret}")
	private String clientSecret;

	@Value("${paypal.mode}")
	private String mode;

	private PayPalHttpClient client;

	@PostConstruct
	public void init() {
        PayPalEnvironment environment;
        if("sandbox".equals(mode)) {
            environment = new PayPalEnvironment.Sandbox(clientId, clientSecret);
        } else {
            environment = new PayPalEnvironment.Live(clientId, clientSecret);
        }
        client = new PayPalHttpClient(environment);
    }

	public PayPalHttpClient getClient() {
		return client;
	}

	//	/**
//	 * Method to pretty print a response
//	 *
//	 * @param jo  JSONObject
//	 * @param pre prefix (default="")
//	 * @return String pretty printed JSON
//	 */
//	public String prettyPrint(JSONObject jo, String pre) {
//		Iterator<?> keys = jo.keys();
//		StringBuilder pretty = new StringBuilder();
//		while (keys.hasNext()) {
//			String key = (String) keys.next();
//			pretty.append(String.format("%s%s: ", pre, StringUtils.capitalize(key)));
//			if (jo.get(key) instanceof JSONObject) {
//				pretty.append(prettyPrint(jo.getJSONObject(key), pre + "\t"));
//			} else if (jo.get(key) instanceof JSONArray) {
//				int sno = 1;
//				for (Object jsonObject : jo.getJSONArray(key)) {
//					pretty.append(String.format("\n%s\t%d:\n", pre, sno++));
//					pretty.append(prettyPrint((JSONObject) jsonObject, pre + "\t\t"));
//				}
//			} else {
//				pretty.append(String.format("%s\n", jo.getString(key)));
//			}
//		}
//		return pretty.toString();
//	}
}
