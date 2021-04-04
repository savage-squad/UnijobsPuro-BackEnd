package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.factory.ConnectionFactory;
import br.uniamerica.unijobs.model.Curso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDao {
    private Connection conn = ConnectionFactory.getConnection();

    public void create(Curso curso) {
        String sql = "insert into cursos " +
                "(nome)" +
                " values (?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, curso.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Curso> findAll() throws SQLException {
        String sql = "SELECT * FROM cursos";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Curso> cursos = new ArrayList<>();
        while (rs.next()) {
            cursos.add(new Curso(rs.getInt(1),rs.getString(2)));
        }
        rs.close();
        stmt.close();
        conn.close();
        return cursos;
    }

    public void edit(Curso curso) {
        String sql = "update cursos set nome=?" +
                "where id_curso=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, curso.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy(Curso curso) {
        try {
            PreparedStatement stmt = conn.prepareStatement("delete " +
                    "from cursos where id_curso=?");
            stmt.setInt(1, curso.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
