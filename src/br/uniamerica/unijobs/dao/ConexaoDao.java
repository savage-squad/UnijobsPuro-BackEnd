package br.uniamerica.unijobs.dao;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDao {    // classe ConexaoDao
	public static final Logger log = LoggerFactory.getLogger(ConexaoDao.class);



	public Connection conectaBD() {  // metodo conectaBD
		Connection conexao = null;   // Nesse metodo foi declarado uma variavel conexao
		
		try {
			String url = "jdbc:mysql://localhost:3306/unijobs?user=root&password=secret";  // nome do dispositivo de conexao com o banco, caminho e o usuario.
			conexao = DriverManager.getConnection(url); // passar todas as informacoes pra essa variavel
			log.debug("Conexão com o banco Sucedida");
		} catch (SQLException erro) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "conexaoDao" + erro.getMessage());
			log.error("Conexão com o banco Falhou");
		}
		return conexao;
		
	}

}
