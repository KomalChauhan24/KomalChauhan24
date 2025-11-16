package com.poc;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LogConsumer {

    @KafkaListener(topics = "kafka-app-logs", groupId = "spring-log-consumers")
    public void consumeLog(String message) {
        System.out.println("Received log message: " + message);
        // You can also process JSON, convert to objects, etc.
    }
}
