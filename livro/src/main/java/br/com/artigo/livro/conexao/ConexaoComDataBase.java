package br.com.artigo.livro.conexao;

import br.com.artigo.livro.entity.Teste;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Service
@NoArgsConstructor
public class ConexaoComDataBase {

    public void addEmplyee(int id) {
        ps -> ps.setString(1, "CArlinho")
        JdbcTemplate jdbcTemplate = new JdbcTemplate().update("INSERT INTO teste (nome) VALUES (?);", );
    }
}
