package com.github.yeast.paypal.api;

import com.github.yeast.paypal.dto.Cart;
import com.github.yeast.paypal.sdk.orders.Authorization;
import com.github.yeast.paypal.sdk.orders.Order;
import com.github.yeast.paypal.sdk.orders.PurchaseUnit;
import com.github.yeast.paypal.sdk.payments.Capture;
import com.github.yeast.paypal.service.OrderService;
import com.github.yeast.paypal.service.PaymentService;
import com.paypal.http.HttpResponse;
import com.paypal.http.serializer.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/paypal")
public class PaymentController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/order/create")
    public String createOrder(@RequestBody Cart cart) {
        try {
            HttpResponse<Order> response =  orderService.createOrderWithMinimumPayload(false, true);

            if (response.result() == null) {
                throw new RuntimeException("Order creation failed: result is null");
            }
            return new Json().serialize(response.result());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/captureOrder/create")
    public String createCaptureOrder(@RequestBody Cart cart) {
        try {
            HttpResponse<Order> response =  orderService.createOrderWithMinimumPayload(true, true);

            if (response.result() == null) {
                throw new RuntimeException("Order creation failed: result is null");
            }
            return new Json().serialize(response.result());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/order/{orderId}/authorize")
    public String authorize(@PathVariable String orderId) {
        try {
            HttpResponse<Order> response =  orderService.authorizeOrder(orderId, true);

            if (response.result() == null) {
                throw new RuntimeException("Order creation failed: result is null");
            }
            return new Json().serialize(response.result());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/order/{orderId}/authAndCap")
    public String authAndCap(@PathVariable String orderId) {
        try {
            HttpResponse<Order> response =  orderService.authorizeOrder(orderId, true);
            Map<String, String> failedMap = new HashMap<>();
            response.result().purchaseUnits().forEach(purchaseUnit -> purchaseUnit.payments().authorizations().stream()
                    .map(Authorization::id).forEach(id -> {
                        try {
                            paymentService.captureAuth(id, true);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            failedMap.put(id, e.getMessage());
                        }
                    }));

            if (response.result() == null) {
                throw new RuntimeException("Order creation failed: result is null");
            }
            if (!failedMap.isEmpty()) {
                throw new RuntimeException("部分capture 失败");
            }
            return new Json().serialize(response.result());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/auth/{authId}/capture")
    public String capture(@PathVariable String authId) {
        try {
            HttpResponse<Capture> response =  paymentService.captureAuth(authId, true);

            if (response.result() == null) {
                throw new RuntimeException("Order creation failed: result is null");
            }
            return new Json().serialize(response.result());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/order/{orderId}/capture")
    public String captureOrder(@PathVariable String orderId) {
        try {
            HttpResponse<Order> response =  orderService.captureOrder(orderId, true);

            if (response.result() == null) {
                throw new RuntimeException("Order creation failed: result is null");
            }
            return new Json().serialize(response.result());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
