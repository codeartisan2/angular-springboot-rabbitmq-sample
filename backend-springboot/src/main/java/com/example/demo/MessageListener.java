package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {
@Autowired
private SimpMessagingTemplate messagingTemplate;
    @RabbitListener(queues = "testQueue")
    public void listen(String message) {
        System.out.println("Received from RabbitMQ: " + message);
messagingTemplate.convertAndSend("/topic/messages", message);
    }
}