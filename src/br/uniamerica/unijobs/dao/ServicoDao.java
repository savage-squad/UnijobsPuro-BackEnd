package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.model.Servico;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServicoDao {
    private Connection connection;

    public ServicoDao(){
        Connection connection;
    }
    public void addServico(Servico servico){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into servicos(titulo, descricao, preco, miniatura,ativo, disponibilidade) values (?, ?, ?, ?, ?)");
            preparedStatement.setString(1,servico.getTitulo());
            preparedStatement.setString(2, servico.getDescricao());
            preparedStatement.setString(3,servico.getPreco());
            preparedStatement.setString(3, servico.getMiniatura());
            preparedStatement.setString(4, servico.getAtivo());
//            preparedStatement.setString(5, servico.getDisponibilidade);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void  deleteServico(int id_servico){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from servicos where id_servico = ? ");
            preparedStatement.setInt(1, id_servico);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update( Servico servico){
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update servicos set titulo=?, descricao=?, preco=?, miniatura=?, ativo=?, disponibilidade=?" +"where id_servico=?");
            preparedStatement.setString(1, servico.getTitulo());
            preparedStatement.setString(2,servico.getDescricao());
            preparedStatement.setString(3,servico.getPreco());
            preparedStatement.setString(4, servico.getMiniatura());
            preparedStatement.setString(5,servico.getAtivo());
//            preparedStatement.setString(6,servico.getDisponibilidade);
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Servico> getAllServicos(){
        List<Servico> listaDeServico = new ArrayList<Servico>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from servicos");
            while (rs.next()){
                Servico servico = new Servico();
                servico.setTitulo(rs.getString("titulo"));
                servico.setDescricao(rs.getString("descricao"));
                servico.setPreco(rs.getBigDecimal("preco"));
                servico.setMiniatura(rs.getString("miniatura"));
                servico.setMiniatura(String.valueOf(rs.getBoolean("ativo")));


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaDeServico;

    }


}
