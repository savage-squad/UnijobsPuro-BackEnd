package br.uniamerica.unijobs.dao;


import br.uniamerica.unijobs.factory.ConnectionFactory;
import br.uniamerica.unijobs.model.TipoUsuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoUsuarioDao {

    public void create(TipoUsuario typeUser) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tipos_usuarios (nome) VALUES(?) ");
            stmt.setString(1, typeUser.getNome());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "salvo com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(TipoUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally {

        }
    }


    }


