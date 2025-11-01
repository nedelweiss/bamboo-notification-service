package com.github.nedelweiss.bamboo.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

//@EnableKafka
@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic createOrdersTopic() {
        return TopicBuilder.name("order_events")
                .build();
    }
}
