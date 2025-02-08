package br.com.artigo.livro.conexao;

import br.com.artigo.livro.entity.Teste;
import com.mysql.cj.jdbc.JdbcPreparedStatement;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Repository
@NoArgsConstructor
public class ConexaoComDataBase {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertEmplyoe() {
        boolean status = false;

        try{
            String INSERT_SQL_QUERY = "INSERT INTO teste(nome) VALUES (?)";
            int count = jdbcTemplate.update(INSERT_SQL_QUERY,"Carlos");
            status = (count>0) ? true : false;
        }catch (Exception e){
            status = false;
            e.printStackTrace();
        }
        return status;


    }
}
