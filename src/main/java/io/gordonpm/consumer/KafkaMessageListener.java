package io.gordonpm.consumer;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "sample-topic", groupId = "gm-group-1") //creates this topic if it does not exist in Kafka
    public void consume(String message) {
        log.info("consumer consumed the message {}", message);
    }
}
