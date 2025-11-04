package com.gkfcsolution.basedomains.dto;

import com.gkfcsolution.basedomains.audit.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2025 at 21:53
 * File: null.java
 * Project: springboot-kafka-microservices
 *
 * @author Frank GUEKENG
 * @date 03/11/2025
 * @time 21:53
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Order extends BaseEntity {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
