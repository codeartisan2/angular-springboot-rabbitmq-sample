package com.example.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @PostMapping
    public String sendMessage(@RequestBody String message) {
        amqpTemplate.convertAndSend("testQueue", message);
        return "Message sent to RabbitMQ: " + message;
    }
}