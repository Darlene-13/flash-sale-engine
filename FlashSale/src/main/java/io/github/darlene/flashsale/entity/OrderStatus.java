package io.github.darlene.flashsale.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import jakarta.validation.constraints.*;


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