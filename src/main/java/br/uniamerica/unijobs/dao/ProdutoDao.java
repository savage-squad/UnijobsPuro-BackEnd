package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.model.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

//    //pega conexao do banco de dados por um metodo estatico da classe ConexaoDao
//    private Connection conn = ConexaoDao.getConnection();
//
//    public List<Produto> findAll() throws SQLException {
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM produtos p Join anuncios a on a.id_anuncio = p.id_anuncio");
//
//        // declarando e instanciando uma lista de usuarios
//        List<Produto> produtos = new ArrayList<>();
//
//
//        while(rs.next()){
////            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//            produtos.add(
//                    rs.getInt(1),
//                    rs.getInt(2),
//                    rs.getInt(3),
//                    rs.getInt(4),
//                    rs.getInt(5),
//                    rs.getInt(6),
//                    rs.getInt(7),
//                    rs.getInt(8)
//            );
//        }
//
//        rs.close();
//        stmt.close();
//        conn.close();
//        return produtos;
//    }
}
