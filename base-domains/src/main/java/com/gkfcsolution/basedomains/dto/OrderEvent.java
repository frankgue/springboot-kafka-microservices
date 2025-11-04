package com.gkfcsolution.basedomains.dto;

import com.gkfcsolution.basedomains.audit.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2025 at 22:01
 * File: null.java
 * Project: springboot-kafka-microservices
 *
 * @author Frank GUEKENG
 * @date 03/11/2025
 * @time 22:01
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderEvent extends BaseEntity {
    private String message;
    private String status;
    private Order order;
}
