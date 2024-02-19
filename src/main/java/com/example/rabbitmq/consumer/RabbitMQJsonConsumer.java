package com.example.rabbitmq.consumer;

import com.example.rabbitmq.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitListener(queues = "javaguides_json")
    public void receiveMessage(User user){
        LOGGER.info(String.format("Received json message -> %s", user.toString()));
    }


}
