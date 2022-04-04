package com.rogerserra.producer.service;

import com.rogerserra.producer.model.OpengateResponse;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public ProducerService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value("${spring.rabbitmq.exchange}") // these values come from application.properties/yml
    private String exchange; // exchange is responsible for routing the messages to different queues

    @Value("${spring.rabbitmq.routingkey}")
    private String routingkey; // defines how to route the messages to the queue depending on the exchange type

    public void send(OpengateResponse response){
        rabbitTemplate.convertAndSend(exchange,routingkey, response);
    }
}
