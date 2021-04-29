package br.uniamerica.unijobs.test;

import br.uniamerica.unijobs.dao.AnuncioDao;
import br.uniamerica.unijobs.model.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnuncioTest {
    public static void main(String[] args) throws SQLException {
        AnuncioDao anuncioDao = new AnuncioDao();

        Curso curso1 = new Curso(1, "Biologia");
		Curso curso2 = new Curso(2, "Musica");
		Curso curso3 = new Curso(3, "Matematica");
		ArrayList<Curso> cursos = new ArrayList();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        Universidade universidade1 = new Universidade(1, "unip", "555", cursos);

        TipoUsuario tipoUsuario1 = new TipoUsuario(1,"Cliente");

        Usuario usuario2 = new Usuario("Milene", "77777", "222", universidade1, curso1, 7,
				"mi@gmail.com", "123", tipoUsuario1);

        Anuncio anuncio1 = new Anuncio(17,"blabla", "blablabla", 1.99, "fsdf", true, 15, usuario2);

//        anuncioDao.create(anuncio1);
//
//        System.out.println(anuncio1.toString());

//        List<Anuncio> anuncios = anuncioDao.findAll();
//
//        for(Anuncio anuncio : anuncios){
//            System.out.println(anuncio);
//        }
//
//        anuncioDao.destroy(anuncio1);
//        System.out.println("Deletado!");
//
//        anuncio1.setDescricao("kkkk");
//        anuncioDao.edit(anuncio1);
//        System.out.println("Editado!");
    }
}
