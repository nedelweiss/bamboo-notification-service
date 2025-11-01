package com.github.nedelweiss.bamboo.configuration;

import org.apache.kafka.clients.admin.AdminClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class KafkaTopicsViewer implements CommandLineRunner {

    private final KafkaAdmin kafkaAdmin;

    @Autowired
    public KafkaTopicsViewer(KafkaAdmin kafkaAdmin) {
        this.kafkaAdmin = kafkaAdmin;
    }

    @Override
    public void run(String... args) throws Exception {
        Map<String, Object> configs = kafkaAdmin.getConfigurationProperties();

        try (AdminClient admin = AdminClient.create(configs)) {
            System.out.println("TOPICS:");
            admin.listTopics().names().get().forEach(System.out::println);
        }
    }
}
