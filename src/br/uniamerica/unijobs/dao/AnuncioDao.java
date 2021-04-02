package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.model.Anuncio;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnuncioDao {
    public void adiciona(Anuncio anuncio) {
        String sql = "insert into anuncios " +
                "(titulo, descricao, preco, miniatura, ativo, prazo, id_usuario)" +
                " values (?,?,?,?,?,?,?)";

        try {
            // prepared statement para inserção
            PreparedStatement stmt = conn.prepareStatement(sql);

            // seta os valores
            stmt.setString(1,anuncio.getUsuario());
            stmt.setString(1,anuncio.getTitulo());
            stmt.setString(2,anuncio.getDescricao());
            stmt.setString(3,anuncio.getPreco());
            stmt.setString(1,anuncio.getAtivo());
            stmt.setString(2,anuncio.getAvaliacoes());
            stmt.setString(3,anuncio.getImagens());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
