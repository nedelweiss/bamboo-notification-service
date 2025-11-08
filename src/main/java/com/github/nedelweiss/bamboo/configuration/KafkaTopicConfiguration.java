package com.github.nedelweiss.bamboo.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

//@EnableKafka
@Configuration
public class KafkaTopicConfiguration {

    @Value("${kafka.topic.order-events}")
    public String orderEventsTopic;

    @Value("${kafka.topic.dlq}")
    private String dlqTopic;

    @Bean
    public NewTopic createOrderEventsTopic() {
        return TopicBuilder.name(orderEventsTopic)
                .build();
    }

    @Bean
    public NewTopic createDLQTopic() {
        return TopicBuilder.name(dlqTopic)
                .build();
    }
}
