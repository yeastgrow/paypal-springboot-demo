package com.github.yeast.paypal.service;

import com.github.yeast.paypal.sdk.orders.*;
import com.paypal.http.HttpResponse;
import com.paypal.http.serializer.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private PayPalClient payPalClient;
    /**
     * Method to create complete order body with <b>AUTHORIZE</b> intent
     *
     * @return OrderRequest with created order request
     */
    private OrderRequest buildCompleteRequestBody() {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.checkoutPaymentIntent("AUTHORIZE");

        ApplicationContext applicationContext = new ApplicationContext().brandName("EXAMPLE INC").landingPage("BILLING")
                .cancelUrl("https://www.example.com").returnUrl("https://www.example.com").userAction("CONTINUE")
                .shippingPreference("SET_PROVIDED_ADDRESS");
        orderRequest.applicationContext(applicationContext);

        List<PurchaseUnitRequest> purchaseUnitRequests = new ArrayList<>();
        PurchaseUnitRequest purchaseUnitRequest = new PurchaseUnitRequest().referenceId("PUHF")
                .description("Sporting Goods").customId("CUST-HighFashions").softDescriptor("HighFashions")
                .amountWithBreakdown(new AmountWithBreakdown().currencyCode("USD").value("220.00")
                        .amountBreakdown(new AmountBreakdown().itemTotal(new Money().currencyCode("USD").value("180.00"))
                                .shipping(new Money().currencyCode("USD").value("20.00"))
                                .handling(new Money().currencyCode("USD").value("10.00"))
                                .taxTotal(new Money().currencyCode("USD").value("20.00"))
                                .shippingDiscount(new Money().currencyCode("USD").value("10.00"))))
                .items(new ArrayList<Item>() {
                    {
                        add(new Item().name("T-shirt").description("Green XL").sku("sku01")
                                .unitAmount(new Money().currencyCode("USD").value("90.00"))
                                .tax(new Money().currencyCode("USD").value("10.00")).quantity("1")
                                .category("PHYSICAL_GOODS"));
                        add(new Item().name("Shoes").description("Running, Size 10.5").sku("sku02")
                                .unitAmount(new Money().currencyCode("USD").value("45.00"))
                                .tax(new Money().currencyCode("USD").value("5.00")).quantity("2")
                                .category("PHYSICAL_GOODS"));
                    }
                })
                .shippingDetail(new ShippingDetail().name(new Name().fullName("John Doe"))
                        .addressPortable(new AddressPortable().addressLine1("123 Townsend St").addressLine2("Floor 6")
                                .adminArea2("San Francisco").adminArea1("CA").postalCode("94107").countryCode("US")));
        purchaseUnitRequests.add(purchaseUnitRequest);
        orderRequest.purchaseUnits(purchaseUnitRequests);
        return orderRequest;
    }

    /**
     * Method to create minimum required order body with <b>AUTHORIZE</b> intent
     *
     * @return OrderRequest with created order request
     */
    private OrderRequest buildMinimumCaptureRequestBody() {
        OrderRequest orderRequest = new OrderRequest();

        List<PurchaseUnitRequest> purchaseUnitRequests = new ArrayList<>();
        PurchaseUnitRequest purchaseUnitRequest = new PurchaseUnitRequest()
                .amountWithBreakdown(new AmountWithBreakdown().currencyCode("USD").value("220.00"));
        purchaseUnitRequests.add(purchaseUnitRequest);

        orderRequest.checkoutPaymentIntent("CAPTURE")
                .purchaseUnits(purchaseUnitRequests);

        return orderRequest;
    }

    private OrderRequest buildMinimumRequestBody() {
        OrderRequest orderRequest = new OrderRequest();

        List<PurchaseUnitRequest> purchaseUnitRequests = new ArrayList<>();
        PurchaseUnitRequest purchaseUnitRequest = new PurchaseUnitRequest()
                .amountWithBreakdown(new AmountWithBreakdown().currencyCode("USD").value("220.00"));
        purchaseUnitRequests.add(purchaseUnitRequest);

        orderRequest.checkoutPaymentIntent("AUTHORIZE")
                .purchaseUnits(purchaseUnitRequests);

        return orderRequest;
    }

    public HttpResponse<Order> createOrder(OrderRequest orderRequest, boolean debug) throws IOException {
        OrdersCreateRequest request = new OrdersCreateRequest();
        request.header("prefer","return=representation");
        request.requestBody(orderRequest);
        HttpResponse<Order> response = payPalClient.getClient().execute(request);
        if (debug) {
            if (response.statusCode() == 201) {
                System.out.println("Order with Complete Payload: ");
                System.out.println("Status Code: " + response.statusCode());
                System.out.println("Status: " + response.result().status());
                System.out.println("Order ID: " + response.result().id());
                System.out.println("Intent: " + response.result().checkoutPaymentIntent());
                System.out.println("Links: ");
                for (LinkDescription link : response.result().links()) {
                    System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
                }
                System.out.println("Total Amount: " + response.result().purchaseUnits().get(0).amountWithBreakdown().currencyCode()
                        + " " + response.result().purchaseUnits().get(0).amountWithBreakdown().value());
            }
        }
        return response;
    }

    /**
     * Method to create order with complete payload
     *
     * @param debug true = print response data
     * @return HttpResponse<Order> response received from API
     * @throws IOException Exceptions from API if any
     */
    public HttpResponse<Order> createOrder(boolean debug) throws IOException {
        OrdersCreateRequest request = new OrdersCreateRequest();
        request.header("prefer","return=representation");
        request.requestBody(buildCompleteRequestBody());
        HttpResponse<Order> response = payPalClient.getClient().execute(request);
        if (debug) {
            if (response.statusCode() == 201) {
                System.out.println("Order with Complete Payload: ");
                System.out.println("Status Code: " + response.statusCode());
                System.out.println("Status: " + response.result().status());
                System.out.println("Order ID: " + response.result().id());
                System.out.println("Intent: " + response.result().checkoutPaymentIntent());
                System.out.println("Links: ");
                for (LinkDescription link : response.result().links()) {
                    System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
                }
                System.out.println("Total Amount: " + response.result().purchaseUnits().get(0).amountWithBreakdown().currencyCode()
                        + " " + response.result().purchaseUnits().get(0).amountWithBreakdown().value());

                System.out.println(new Json().serialize(response.result()));

            }
        }
        return response;
    }

    /**
     * Method to create order with minimum required payload
     *
     * @param debug true = print response data
     * @return HttpResponse<Order> response received from API
     * @throws IOException Exceptions from API if any
     */
    public HttpResponse<Order> createOrderWithMinimumPayload(boolean isCapture,boolean debug) throws IOException {
        OrdersCreateRequest request = new OrdersCreateRequest();
        request.header("prefer","return=representation");
        if (isCapture) {
            request.requestBody(buildMinimumCaptureRequestBody());
        } else {
            request.requestBody(buildMinimumRequestBody());
        }

        HttpResponse<Order> response = payPalClient.getClient().execute(request);
        if (debug) {
            if (response.statusCode() == 201) {
                System.out.println("Order with Minimum Payload: ");
                System.out.println("Status Code: " + response.statusCode());
                System.out.println("Status: " + response.result().status());
                System.out.println("Order ID: " + response.result().id());
                System.out.println("Intent: " + response.result().checkoutPaymentIntent());
                System.out.println("Links: ");
                for (LinkDescription link : response.result().links()) {
                    System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
                }
                System.out.println("Total Amount: " + response.result().purchaseUnits().get(0).amountWithBreakdown().currencyCode()
                        + " " + response.result().purchaseUnits().get(0).amountWithBreakdown().value());
            }
        }
        return response;
    }

    /**
     * Building empty request body. This can be updated with required fields as per
     * need.
     *
     * @return OrderActionRequest with empty body
     */
    private OrderRequest buildRequestBody() {
        return new OrderRequest();
    }

    /**
     * Method to authorize order after creation
     *
     * @param orderId Valid Approved Order ID from createOrder response
     * @param debug   true = print response data
     * @return HttpResponse<Order> response received from API
     * @throws IOException Exceptions from API if any
     */
    public HttpResponse<Order> authorizeOrder(String orderId, boolean debug) throws IOException {
        OrdersAuthorizeRequest request = new OrdersAuthorizeRequest(orderId);
        request.requestBody(buildRequestBody());
        HttpResponse<Order> response = payPalClient.getClient().execute(request);
        if (debug) {
            System.out.println("Authorization Ids:");
            response.result().purchaseUnits().forEach(purchaseUnit -> purchaseUnit.payments().authorizations().stream()
                    .map(Authorization::id).forEach(System.out::println));
            System.out.println("Link Descriptions: ");
            for (LinkDescription link : response.result().links()) {
                System.out.println("\t" + link.rel() + ": " + link.href());
            }
        }
        return response;
    }

    /**
     * Method to capture order after creation. Valid approved order Id should be
     * passed an argument to this method.
     *
     * @param orderId Order ID from createOrder response
     * @param debug   true = print response data
     * @return HttpResponse<Order> response received from API
     * @throws IOException Exceptions from API if any
     */
    public HttpResponse<Order> captureOrder(String orderId, boolean debug) throws IOException {
        OrdersCaptureRequest request = new OrdersCaptureRequest(orderId);
        request.requestBody(buildRequestBody());
        HttpResponse<Order> response = payPalClient.getClient().execute(request);
        if (debug) {
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Status: " + response.result().status());
            System.out.println("Order ID: " + response.result().id());
            System.out.println("Links: ");
            for (LinkDescription link : response.result().links()) {
                System.out.println("\t" + link.rel() + ": " + link.href());
            }
            System.out.println("Capture ids:");
            for (PurchaseUnit purchaseUnit : response.result().purchaseUnits()) {
                for (Capture capture : purchaseUnit.payments().captures()) {
                    System.out.println("\t" + capture.id());
                }
            }
            System.out.println("Buyer: ");
            Payer buyer = response.result().payer();
            System.out.println("\tEmail Address: " + buyer.email());
            System.out.println("\tName: " + buyer.name().givenName() + " " + buyer.name().surname());
            System.out.println("Full response body:");
        }
        return response;
    }

}
