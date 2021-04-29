package br.uniamerica.unijobs.test;

import br.uniamerica.unijobs.dao.TipoProdutoDao;
import br.uniamerica.unijobs.model.TipoProduto;

import java.sql.SQLException;
import java.util.List;

public class TipoProdutoTest {
    public static void main(String[] args) throws SQLException {
        TipoProdutoDao tipoProdutoDao = new TipoProdutoDao();
        List<TipoProduto> tiposProdutos = tipoProdutoDao.findAll(); //deve retornar uma lista

        for (TipoProduto tipoProduto : tiposProdutos){
            System.out.println(tipoProduto);
        }


    }
}
