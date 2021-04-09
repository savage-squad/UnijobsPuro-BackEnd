package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.factory.ConnectionFactory;
import br.uniamerica.unijobs.model.Servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServicoDao {

    private Connection connection;
    public ServicoDao(){
        this.connection = ConnectionFactory.getConnection();
    }

    public List<Servico> findAll() throws SQLException {
        String sql = "SELECT * FROM servicos";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();

        List<Servico> servicos = new ArrayList<>();

        while (rs.next()){
            servicos.add(new Servico(rs.getString(1)));
        }
        rs.close();
        stm.close();
        return servicos;
    }
    public  Servico find(Integer id){
        String sql = "SELECT * FROM servicos WHERE id_servico = ?";
        try {
            try {
                PreparedStatement stm = connection.prepareStatement(sql);
                stm.setInt(1, id);
                ResultSet rs = stm.executeQuery();

                if (rs.next()){
                    Servico.setId(rs.getInt(1));
                    Servico.setTitulo(rs.getString(2));
                    Servico.setPreco((double) rs.getFloat(3));
                    Servico.setMiniatura(rs.getString(4));
                    Servico.setTitulo(rs.getString(5));
                    Servico.setAtivo(rs.getShort(6));
                    Servico.setDisponibilidade(rs.getString(7));



                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


}
