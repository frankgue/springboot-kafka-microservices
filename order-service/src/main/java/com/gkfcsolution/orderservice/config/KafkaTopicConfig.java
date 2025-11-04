package com.gkfcsolution.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Created on 2025 at 23:23
 * File: null.java
 * Project: springboot-kafka-microservices
 *
 * @author Frank GUEKENG
 * @date 03/11/2025
 * @time 23:23
 */
@Configuration
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    // Spring Bean for Kafka Topic
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName)
                .build();
    }
}
