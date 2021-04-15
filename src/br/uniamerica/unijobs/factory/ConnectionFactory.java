package br.uniamerica.unijobs.factory;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

//    private static final String DRIVER = "com.mysql.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/unijobs";
//    private static final String USER = "root";
//    private static final String PASS = "secret";
//
//    public static Connection getConnection() {
//        try {
//            Class.forName(DRIVER);
//            return DriverManager.getConnection(URL, USER, PASS);
//        } catch (ClassNotFoundException | SQLException ex) {
//            throw new RuntimeException("Erro na conexão: ", ex);
//        }
//    }
//
//    public static void closeConnection(Connection con) {
//        try {
//            if (con != null) {
//                con.close();
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public static void closeConnection(Connection con, PreparedStatement stmt) {
//
//        closeConnection(con);
//
//        try {
//
//            if (stmt != null) {
//                stmt.close();
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
//
//        closeConnection(con, stmt);
//
//        try {
//
//            if (rs != null) {
//                rs.close();
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }




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




