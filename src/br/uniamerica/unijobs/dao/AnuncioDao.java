package br.uniamerica.unijobs.dao;

import br.uniamerica.unijobs.factory.ConnectionFactory;

import java.sql.Connection;

public class AnuncioDao {

    private Connection connection;
    public AnuncioDao(){
        this.connection = ConnectionFactory.getConnection();
    }

}
