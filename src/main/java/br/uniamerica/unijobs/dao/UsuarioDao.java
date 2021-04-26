package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.factory.ConnectionFactory;
import br.uniamerica.unijobs.model.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    //pega conexao do banco de dados por um metodo estatico da classe ConexaoDao
    private Connection conn = ConnectionFactory.getConnection();

    public List<Usuario> findAll() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");

        // primeiro cria e instancia uma lista vaazia do tipo Usuario
        List<Usuario> usuarios = new ArrayList<>();


        while(rs.next()){
//       precore cada linha da tabela usuario e adiciona na lista de usuarios instanciando um Usuario
            usuarios.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6)));
        }

        rs.close();
        stmt.close();
        conn.close();
        //returna a lista de usuarios
        return usuarios;
    }
}