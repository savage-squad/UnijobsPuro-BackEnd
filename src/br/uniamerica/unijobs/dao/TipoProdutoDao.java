package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.model.TipoProduto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoProdutoDao {

    //pega conexao do banco de dados por um metodo estatico da classe ConexaoDao
    private Connection conn = ConexaoDao.getConnection();

    public List<TipoProduto> findAll() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM tipos_produto");

        // declarando e instanciando uma lista de tipos produtos
        List<TipoProduto> tiposProdutos = new ArrayList<>();


        while(rs.next()){
            tiposProdutos.add(new TipoProduto(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }

        rs.close();
        stmt.close();
        conn.close();
        return tiposProdutos;
    }
}
