package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.factory.ConnectionFactory;
import br.uniamerica.unijobs.model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    //pega conexao do banco de dados por um metodo estatico da classe ConexaoDao
    private Connection conn = ConnectionFactory.getConnection();

    public List<Usuario> findAll() throws SQLException {
        String sql = "SELECT * FROM usuarios";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        // declarando e instanciando uma lista de usuarios
        List<Usuario> usuarios = new ArrayList<>();


        while(rs.next()){
//            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            usuarios.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6)));
        }

        rs.close();
        stmt.close();
        conn.close();
        return usuarios;
    }
}
