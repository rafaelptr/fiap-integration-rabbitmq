package br.com.fiap.integration.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumidor {
    
	@RabbitListener(queues = "fiap.scj.messages")
    public void receiveMessage(String msg){
        System.out.println(msg);
    }
        
}