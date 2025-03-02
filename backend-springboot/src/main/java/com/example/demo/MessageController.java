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
public ResponseEntity<String> sendMessage(@RequestBody String message) {
    try {
        amqpTemplate.convertAndSend("testQueue", message);
        return ResponseEntity.ok("Message sent to RabbitMQ: " + message);
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("Failed to send message.");
    }
}
}