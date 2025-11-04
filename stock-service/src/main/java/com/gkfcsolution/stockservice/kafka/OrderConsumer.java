package com.gkfcsolution.stockservice.kafka;

import com.gkfcsolution.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created on 2025 at 17:33
 * File: null.java
 * Project: springboot-kafka-microservices
 *
 * @author Frank GUEKENG
 * @date 04/11/2025
 * @time 17:33
 */
@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent orderEvent) {
        LOGGER.info(String.format("Order event receive in Stock-Service => %s", orderEvent.toString()));

        //Save the order event into the database
    }
}
