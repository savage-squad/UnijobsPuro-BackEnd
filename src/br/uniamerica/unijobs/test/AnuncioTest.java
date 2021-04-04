package br.uniamerica.unijobs.test;

import br.uniamerica.unijobs.dao.AnuncioDao;
import br.uniamerica.unijobs.model.Anuncio;

import java.sql.SQLException;
import java.util.List;

public class AnuncioTest {
    public static void main(String[] args) throws SQLException {
        AnuncioDao anuncioDao = new AnuncioDao();
        List<Anuncio> anuncios = anuncioDao.findAll();
//        Usuario usuario = usuarioDao.findById(1);
        for (Anuncio anuncio : anuncios){
            System.out.println(anuncio);
        }


    }
}
