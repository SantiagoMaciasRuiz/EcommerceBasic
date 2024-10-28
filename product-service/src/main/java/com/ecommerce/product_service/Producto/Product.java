package com.ecommerce.product_service.Producto;

import jakarta.persistence.Id;

public class Product {
        @Id
        private String id;
        private String name;
        private double price;
}
