package com.github.nedelweiss.bamboo.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaOrderProducer {

    @Value("${kafka.topic.order-events}")
    public String orderEventsTopic;

    // TODO: replace Object to Generic class
    private final KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public KafkaOrderProducer(KafkaTemplate<String, OrderEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(OrderEvent orderEvent) {
        kafkaTemplate.send(orderEventsTopic, orderEvent);
    }

}