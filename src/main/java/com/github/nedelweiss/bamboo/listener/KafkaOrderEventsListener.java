package com.github.nedelweiss.bamboo.listener;

import com.github.nedelweiss.bamboo.producer.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaOrderEventsListener {

    @KafkaListener(topics = "${kafka.topic.order-events}")
    public void consume(OrderEvent orderEvent) {
        System.out.println("Order events received: " + orderEvent);
    }
}
