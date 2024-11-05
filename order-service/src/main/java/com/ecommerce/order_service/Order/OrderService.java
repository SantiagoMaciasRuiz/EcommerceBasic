package com.ecommerce.order_service.Order;

import com.ecommerce.order_service.ProductoCliente.Product;
import com.ecommerce.order_service.ProductoCliente.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductClient productClient;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order addOrder(Order order) {
        Product product = productClient.getProductById(order.getProductId());
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
