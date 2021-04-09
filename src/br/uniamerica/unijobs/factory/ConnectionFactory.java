package br.uniamerica.unijobs.factory;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {  // metodo conectaBD
        Connection conexao = null;   // Nesse metodo foi declarado uma variavel conexao

        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("secret");
            dataSource.setServerName("localhost");
            dataSource.setServerTimezone("UTC");
            dataSource.setDatabaseName("unijobs");
            conexao  = dataSource.getConnection();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "conexao" + erro.getMessage());
            System.out.println("Conexão com o banco Falhou");
        } finally {
            return conexao;
        }

    }

}
