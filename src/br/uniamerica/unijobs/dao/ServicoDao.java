//package br.uniamerica.unijobs.dao;
//
//import br.uniamerica.unijobs.factory.ConnectionFactory;
//import br.uniamerica.unijobs.model.Servico;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class ServicoDao {
//
////    private Connection connection;
////
////    public ServicoDao() {
////        this.connection = ConnectionFactory.getConnection();
////    }
////    public Servico find(Integer id) {
////        String sql = "SELECT * FROM sericos where id_servico = ?";
////
////
////            try {
////                PreparedStatement stmt = connection.prepareStatement(sql);
////                stmt.setInt(1, id);
////                ResultSet rs = stmt.executeQuery();
////                Servico servico = new Servico();
////                if(rs.next()){
////                    servico.setId(1);
////                    servico.setTipoServico();
////
////
////                }
////            } catch (SQLException throwables) {
////                throwables.printStackTrace();
////            }
//
//    }
//}
