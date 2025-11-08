package com.github.nedelweiss.bamboo.producer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final KafkaOrderProducer producer;

    public Controller(KafkaOrderProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/push")
    public String pushToTopic(@RequestBody OrderEvent orderEvent) {
        producer.produce(orderEvent);
        return "Message has been sent";
    }
}
