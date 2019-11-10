package com.funtl.hello.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RabbitProvider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String content = "Hello" + new Date();
        System.out.println("Provider:" + content);
        amqpTemplate.convertAndSend("helloRabbit", content);
    }
}
