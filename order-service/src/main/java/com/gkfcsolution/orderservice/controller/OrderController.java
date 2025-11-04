package com.gkfcsolution.orderservice.controller;

import com.gkfcsolution.basedomains.dto.Order;
import com.gkfcsolution.basedomains.dto.OrderEvent;
import com.gkfcsolution.orderservice.kafka.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created on 2025 at 23:50
 * File: null.java
 * Project: springboot-kafka-microservices
 *
 * @author Frank GUEKENG
 * @date 03/11/2025
 * @time 23:50
 */
@RestController
@RequestMapping("/api/v1")
public class OrderController {
    private OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order){
        order.setOrderId(UUID.randomUUID().toString());

        OrderEvent orderEvent = OrderEvent.builder()
                .status("PENDING")
                .message("Order status is pending state")
                .order(order)
                .build();

        orderProducer.sendMessage(orderEvent);

        return "Order placed successfully ...";
    }
}
