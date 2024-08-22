package com.github.yeast.paypal.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {
    private String itemId;
    private int quantity;
}
