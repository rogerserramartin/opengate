package com.rogerserra.producer.controller;

import com.rogerserra.producer.model.OpengateResponse;
import com.rogerserra.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class ProducerController {

    private final ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @Value("${app.message}")
    private String message;

    @PostMapping(value = "response") //localhost:9091/api/v1/response
    public String sendResultToRabbitmq(OpengateResponse response){
        producerService.send(response);
        return message;
    }
}
