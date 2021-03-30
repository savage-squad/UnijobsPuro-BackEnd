package br.uniamerica.unijobs.test;

import br.uniamerica.unijobs.dao.ConexaoDao;
import br.uniamerica.unijobs.dao.UsuarioDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioTest {
    public static void main(String[] args) throws SQLException {
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.findAll();
    }
}
