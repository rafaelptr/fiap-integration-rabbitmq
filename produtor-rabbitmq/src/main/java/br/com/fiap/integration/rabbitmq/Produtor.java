package br.com.fiap.integration.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Produtor implements CommandLineRunner{
    private final RabbitTemplate rabbitTemplate;

    public Produtor(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Sending message...");
        for(int i = 1; i <= 1000000; i++)
            rabbitTemplate.convertAndSend("fiap.scj.messages",null,String.format("Hello from RabbitMQ! %d",i));
    }

}