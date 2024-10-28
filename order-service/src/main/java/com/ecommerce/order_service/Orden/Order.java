package com.ecommerce.order_service.Orden;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
    @Id
    private String id;
    private String productId;
    private int quantity;


}
