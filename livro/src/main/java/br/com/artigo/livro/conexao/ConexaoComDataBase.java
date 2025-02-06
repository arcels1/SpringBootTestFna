package br.com.artigo.livro.conexao;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Service
@NoArgsConstructor
public class ConexaoComDataBase {
   // @Value("${url}")
    private String url = "jdbc:mysql://localhost:3306/mysql";
    @Value("${username}")
    private String user;
    @Value("${password}")
    private String password;

    public void getConexao() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnesction(url, user, password);

        } catch (SQLException sqlException) {
            System.out.println("SQL Error: " + sqlException.getMessage());
            System.out.println("SQL State: " + sqlException.getSQLState());
            System.out.println("SQL ErrorCode: " + sqlException.getErrorCode());
        }
       // return conexao;
    }
}
