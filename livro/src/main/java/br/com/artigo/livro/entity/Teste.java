package br.com.artigo.livro.entity;


import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.annotation.Id;


public class Teste {

    @Id
    private Integer id;
    private String nome;
}
