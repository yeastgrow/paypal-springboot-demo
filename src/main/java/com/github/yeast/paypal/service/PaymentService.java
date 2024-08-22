package com.github.yeast.paypal.service;

import com.github.yeast.paypal.sdk.orders.OrderRequest;
import com.github.yeast.paypal.sdk.payments.Capture;
import com.github.yeast.paypal.sdk.payments.LinkDescription;
import com.github.yeast.paypal.sdk.payments.AuthorizationsCaptureRequest;
import com.paypal.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PaymentService {

    @Autowired
    private PayPalClient payPalClient;

    /**
     * Creating empty body for capture request
     *
     * @return OrderRequest request with empty body
     */
    public OrderRequest buildRequestBody() {
        return new OrderRequest();
    }

    /**
     * Method to capture order after authorization
     *
     * @param authId Authorization ID from authorizeOrder response
     * @param debug  true = print response data
     * @return HttpResponse<Capture> response received from API
     * @throws IOException Exceptions from API if any
     */
    public HttpResponse<Capture> captureAuth(String authId, boolean debug) throws IOException {
        AuthorizationsCaptureRequest request = new AuthorizationsCaptureRequest(authId);
        request.requestBody(buildRequestBody());
        HttpResponse<Capture> response = payPalClient.getClient().execute(request);
        if (debug) {
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Status: " + response.result().status());
            System.out.println("Capture ID: " + response.result().id());
            System.out.println("Links: ");
            for (LinkDescription link : response.result().links()) {
                System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
            }
        }
        return response;
    }
}
