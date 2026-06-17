package io.github.darlene.flashsale.entity;


import lombok.*;

@Getter
public enum OrderStatus{

    PENDING("Order is Pending"),
    FAILED("Purchase order failed"),
    CONFIRMED("Order purchase confirmed successfully");
    private String description;

    OrderStatus(String description){
        this.description = description;
    }
}