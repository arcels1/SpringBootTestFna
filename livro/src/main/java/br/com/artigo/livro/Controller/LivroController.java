package br.com.artigo.livro.Controller;

import br.com.artigo.livro.conexao.ConexaoComDataBase;
import br.com.artigo.livro.entity.Categoria;
import br.com.artigo.livro.entity.Livro;
import br.com.artigo.livro.entity.Modelo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class LivroController {

    @ResponseBody
    @RequestMapping("/livros")
    public List<Livro> listar(){

        Livro  livro = new Livro(234L,"Nietchz",2,"assim falou zaratusta",Categoria.FICCAO,Modelo.EBOOK);
        ConexaoComDataBase conexao = new ConexaoComDataBase();
        Boolean certo =conexao.insertEmplyoe();
        return Arrays.asList(livro,livro,livro);
    }
}
