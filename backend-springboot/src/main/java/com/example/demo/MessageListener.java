package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    @RabbitListener(queues = "testQueue")
    public void listen(String message) {
        System.out.println("Received from RabbitMQ: " + message);
    }
}