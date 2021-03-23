package br.uniamerica.unijobs.conection;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;


public class Conexao {
	  String database = "unijobs"; //nome do banco
	  String user = "root";  // nome do usuario do banco
	  String password = "secret"; // Aqui será a senha do banco de dado
	  String hostname = "localhost:3306";
	  String url = "jdbc:mysql://" + hostname + "/" +database;
	  private Connection conexao = null;
	  
	  public Boolean AbreConexao() throws SQLException {
	        try { 
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         conexao = DriverManager.getConnection(url, user, password);
	        } catch (ClassNotFoundException e ){
	            System.err.println("Classe não encontrada");
	        }
	        return true;
	    }
	    
	    public Boolean FechaConexao(){
	        try { 
	            conexao.close();
	            return true;
	        }
	        catch(SQLException e){
	            System.err.println("Erro " + e.getMessage());
	        }
	        return false;
	    }

	    public Connection getConexao() {
	        return conexao;
	    }

	    public void setConexao(Connection conexao) {
	        this.conexao = conexao;
	    }

}
