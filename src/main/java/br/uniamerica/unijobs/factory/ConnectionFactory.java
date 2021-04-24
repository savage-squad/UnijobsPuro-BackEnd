package br.uniamerica.unijobs.factory;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    String database = "unijobs";
    String user = "root";
    String hostname = "localhost:3306";
    String url = "jdbc:mysql//" + hostname + "/" + database;


    public static Connection getConnection() {
        // metodo conectaBD
        Connection conexao = null;

        // Nesse metodo foi declarado uma variavel conexao

        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("secret");
            dataSource.setServerName("localhost");
            dataSource.setServerTimezone("UTC");
            dataSource.setDatabaseName("unijobs");
            conexao = dataSource.getConnection();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "conexao" + erro.getMessage());
            System.out.println("Conexão com o banco Falhou");
        }
        return conexao;
    }
    public static void closeconnection(Connection conexao){
        try {
            if (conexao !=null) conexao.close();
        } catch (SQLException ex) {
            System.err.println("erro" +ex);
        }
    }
    public static void closeconnection(Connection conexao, PreparedStatement stnt){
        try {
            if (stnt !=null){
                stnt.close();
            }
        } catch (SQLException ex) {
            System.err.println("erro" + ex);
        }
        closeconnection(conexao);
    }
    public static void closeconnection(Connection conexao, PreparedStatement stnt, ResultSet rs) {
        try {
            if (rs !=null) {
                rs.close();
            }
        } catch (SQLException ex) {
            System.err.println("erro" + ex);
        }
        closeconnection(conexao,stnt);
    }

}

