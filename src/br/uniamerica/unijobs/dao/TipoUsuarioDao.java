package br.uniamerica.unijobs.dao;


import br.uniamerica.unijobs.model.TipoUsuario;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoUsuarioDao {
    private DataSource dataSource;

    public TipoUsuarioDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public ArrayList<TipoUsuario> readAll(){
        try {
            String SQL = "SELECT * FROM tipos_usuarios ";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            ArrayList<TipoUsuario> lista = new ArrayList<TipoUsuario>();

            while(rs.next()){
                TipoUsuario typeUser = new TipoUsuario();
                typeUser.setId(rs.getInt("id"));
                typeUser.setNome(rs.getString("nome"));

                lista.add(typeUser);
            }
            ps.close();
            return lista;

        }
        catch (SQLException ex){
            System.err.println("Erro ao recuperar" +ex.getMessage());
        }
        catch (Exception ex){
            System.err.println("Erro geral..." +ex.getMessage());
        }
        return  null;

    }
}


