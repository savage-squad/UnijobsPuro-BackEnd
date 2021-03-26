package br.uniamerica.unijobs;

import br.uniamerica.unijobs.controller.ProdutoController;
import br.uniamerica.unijobs.dao.ConexaoDao;
import br.uniamerica.unijobs.model.*;
import com.mysql.cj.jdbc.MysqlDataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Application {

	public static void main(String[] args) throws SQLException {

//		Curso curso1 = new Curso(1, "Engenharia Software");
//		Curso curso2 = new Curso(2, "Direito");
//		Curso curso3 = new Curso(3, "Medicina");
//		ArrayList<Curso> cursos = new ArrayList();
//
//		cursos.add(curso1);
//		cursos.add(curso2);
//		cursos.add(curso3);
//
//		Universidade universidade1 = new Universidade(1, "Uniamerica", "888888888888888", cursos);
//
//		TipoUsuario tipoUsuario1 = new TipoUsuario(1,"Administrador Geral");
//
//		Usuario usuario1 = new Usuario("Nelson", "888888888", 888888, universidade1, curso1, 1,
//				"teste@gmail.com", "semsenha", tipoUsuario1);
//
//		Usuario usuario2 = new Usuario("Milene", "77777", 7777, universidade1, curso1, 7,
//				"mi@gmail.com", "123", tipoUsuario1);
//
//		System.out.println(usuario1);
//
//		TipoProduto tipoProduto = new TipoProduto(1, "Gastronomia", "Produtos relacionados a comestiveis");
//
//		ArrayList<Imagem> imagens = new ArrayList();
//		ArrayList<Avaliacao> avaliacoes = new ArrayList();
//
//		Produto produto = new Produto(1, usuario2, "Rocambole", "Sabor coco com chocolate", 20.99,
//				"https://www.google.com/url?sa=i&url=https%3", true, avaliacoes, imagens, 1, tipoProduto);
//
//		System.out.println(produto);
//

		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("unijobs");
		dataSource.setPassword("unijobs123");
		dataSource.setServerName("localhost");
		dataSource.setServerTimezone("UTC");
		dataSource.setDatabaseName("unijobs");

		Connection conn = dataSource.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");

		while(rs.next()){
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}

		rs.close();
		stmt.close();
		conn.close();

	}

}
