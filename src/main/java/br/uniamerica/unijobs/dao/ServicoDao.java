package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.factory.ConnectionFactory;
import br.uniamerica.unijobs.model.Servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicoDao {
    private Connection conexao = null;

    public ServicoDao() {
        conexao = ConnectionFactory.getConnection();
    }
    //metodo para visualizar servico no inicio

    public List<Servico> visualizar() {
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Servico> servicos = new ArrayList<>();
        try {
            stmt = conexao.prepareStatement ("SELECT  * FROM servicos");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Servico Servico = new Servico();
                Servico.setId(rs.getInt("id"));
                Servico.setTitulo(rs.getString("titulo"));
                Servico.setDescricao(rs.getString("descricao"));
                Servico.setPreco(rs.getDouble("preco"));
                Servico.setMiniatura(rs.getString("miniatura"));
                Servico.setAtivo(rs.getBoolean("ativo"));
                servicos.add(Servico);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeconnection(conexao, stmt, rs);
        }
        return servicos;
    }
    //metodo que procura os servicos
    public List<Servico> procurar(String servico){
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Servico> Servicos = new ArrayList<>();
        try {
            stmt = conexao.prepareStatement("SELECT * servicos WHERE id=?");
            stmt.setString(1, servico);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Servico Servico = new Servico();
                Servico.setId(rs.getInt(rs.getInt("id")));
                Servico.setTitulo(rs.getString("titulo"));
                Servico.setDescricao(rs.getNString("descricao"));
                Servico.setPreco(rs.getDouble("preco"));
                Servico.setMiniatura(rs.getString("miniatura"));
                Servico.setAtivo(rs.getBoolean("ativo"));
                Servicos.add(Servico);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ServicoDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            ConnectionFactory.closeconnection(conexao,stmt, rs);
        }
        return Servicos;
    }
    //metodo que cadastra o servico
    public boolean adicionar(Integer id, String titulo, String descricao, Double preco, String miniatura, Boolean ativo) throws Exception {
        String sql = "INSERT INT servicos (titulo, descricao, preco, miniatura, ativo) Values (?, ?, ?,?,?,?)";
        PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement(sql);

            stmt.setString(2, descricao);
            stmt.setString(3,descricao);
            stmt.setDouble(4,preco);
            stmt.setString(5, miniatura);
            stmt.setBoolean(6, ativo);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("erro" +ex);
            return false;
        }
    }
    //metodo para apagar servico
    public boolean apagar(Servico servico) {
        String sql = "DELETE FROM servicos WHERE titulo=?";
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, servico.getTitulo());
            stmt.executeUpdate();
            return  true;

        } catch (SQLException ex) {
            System.err.print("Erro" +ex);
            return false;
        } finally {
            ConnectionFactory.closeconnection(conexao, stmt);
        }
    }
}