package br.uniamerica.unijobs.factory;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {    // classe ConexaoDao


	public static Connection getConnection() {  // metodo conectaBD
		Connection conexao = null;   // Nesse metodo foi declarado uma variavel conexao

		try {
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUser("root");
			dataSource.setPassword("100%=West");
			dataSource.setServerName("localhost");
			dataSource.setServerTimezone("UTC");
			dataSource.setDatabaseName("unijobs");
			conexao  = dataSource.getConnection();
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "conexaoDao" + erro.getMessage());
			System.out.println("Conexão com o banco Falhou");
		} finally {
			return conexao;
		}

	}

}
