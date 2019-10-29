package br.com.fiap.integration.starter;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		//padrao builder - Gof
		Pessoa charles = Pessoa.builder().cpf("999.999.999-99").nome("Charles").idade(20).build();
		//construtor
		Pessoa carlos = new Pessoa("888.888.888-88","Carlos",28);
		//apresentacao 
		Arrays.asList(charles,carlos).forEach(pessoa -> System.out.println(pessoa.apresentar()));
		
		return null;
	}
}
