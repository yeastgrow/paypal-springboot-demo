package com.github.yeast.paypal.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Cart {
    private List<Order> cart;
}
