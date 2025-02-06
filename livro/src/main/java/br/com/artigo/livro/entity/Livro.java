package br.com.artigo.livro.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Livro {

    private Long id;
    private String titulo;
    private Integer edicao;
    private String autor;
    private Categoria categoria;
    private Modelo modelo;

}
