package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.model.Anuncio;
import br.uniamerica.unijobs.factory.ConnectionFactory;
import br.uniamerica.unijobs.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnuncioDao {
    private Connection conn = ConnectionFactory.getConnection();
    public void create(Anuncio anuncio) {
        String sql = "insert into anuncios " +
                "(titulo, descricao, preco, miniatura, ativo, prazo, id_usuario)" +
                " values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1,anuncio.getTitulo());
            stmt.setString(2,anuncio.getDescricao());
            stmt.setDouble(3,anuncio.getPreco());
            stmt.setString(4,anuncio.getMiniatura());
            stmt.setBoolean(5,anuncio.getAtivo());
            stmt.setInt(6,anuncio.getPrazo());
            stmt.setInt(7,anuncio.getUsuario().getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Anuncio> findAll() throws SQLException {
        String sql = "SELECT * FROM anuncios";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Anuncio> anuncios = new ArrayList<>();
        while(rs.next()){
            Usuario usuario = new Usuario();
            anuncios.add(new Anuncio(rs.getInt(1), rs.getString(2), rs.getString(3),
            rs.getDouble(4), rs.getString(5), rs.getBoolean(6), rs.getInt(7), usuario));
        }

        rs.close();
        stmt.close();
        conn.close();
        return anuncios;
    }

    public void edit(Anuncio anuncio) {
        String sql = "update anuncios set titulo=?, descricao=?, preco=?, miniatura=?, ativo=?, prazo=?, id_usuario=?" +
                " where id_anuncio=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,anuncio.getTitulo());
            stmt.setString(2,anuncio.getDescricao());
            stmt.setDouble(3,anuncio.getPreco());
            stmt.setString(4,anuncio.getMiniatura());
            stmt.setBoolean(5,anuncio.getAtivo());
            stmt.setInt(6,anuncio.getPrazo());
            stmt.setInt(7,anuncio.getUsuario().getId());
            stmt.setInt(8,anuncio.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy(Anuncio anuncio) {
        try {
            PreparedStatement stmt = conn.prepareStatement("delete " +
                    "from anuncios where id_anuncio=?");
            stmt.setInt(1, anuncio.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}