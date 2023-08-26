package com.ninjavin.apachekafkaconsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "first-test-topic", groupId = "group-1")
    public void consume(String message) {
        log.info("Consumer consume the message {}", message);
    }
}
