package br.com.fiap.integration.starter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString(exclude={"cpf"})
@Builder
public class Pessoa {
    @SuppressWarnings("unused")
    private String cpf;
    
    @Getter
    private String nome;
    
    @Getter
    private int idade;

    public String apresentar(){
        return String.format("Prazer meu nome é %s e tenho %d anos", this.nome, this.idade);
    }
}