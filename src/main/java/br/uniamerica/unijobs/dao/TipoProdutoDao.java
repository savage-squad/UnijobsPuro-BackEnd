package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.factory.ConnectionFactory;
import br.uniamerica.unijobs.model.TipoProduto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoProdutoDao {

    //pega conexao do banco de dados por um metodo estatico da classe ConexaoDao
    private Connection conn = ConnectionFactory.getConnection();

    public List<TipoProduto> findAll() throws SQLException {
        String sql = "SELECT * FROM tipos_produto";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

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
