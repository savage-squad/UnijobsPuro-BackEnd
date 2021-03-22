package br.uniamerica.unijobs;

import br.uniamerica.unijobs.controller.ProdutoController;
import br.uniamerica.unijobs.model.*;

import java.util.ArrayList;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso1 = new Curso(1, "Engenharia Software");
		Curso curso2 = new Curso(2, "Direito");
		Curso curso3 = new Curso(3, "Medicina");
		ArrayList<Curso> cursos = new ArrayList();

		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		Universidade universidade1 = new Universidade(1, "Uniamerica", "888888888888888", cursos);

		TipoUsuario tipoUsuario1 = new TipoUsuario(1,"Administrador Geral");

		Usuario usuario1 = new Usuario("Nelson", "888888888", 888888, universidade1, curso1, 1,
				"teste@gmail.com", "semsenha", tipoUsuario1);

		Usuario usuario2 = new Usuario("Milene", "77777", 7777, universidade1, curso1, 7,
				"mi@gmail.com", "123", tipoUsuario1);

		TipoProduto tipoProduto = new TipoProduto(1, "Gastronomia", "Produtos relacionados a comestiveis");

		ArrayList<Imagem> imagens = new ArrayList();
		ArrayList<Avaliacao> avaliacoes = new ArrayList();

		Produto produto = new Produto(1, usuario2, "Rocambole", "Sabor coco com chocolate", 20.99,
				"https://www.google.com/url?sa=i&url=https%3", true, avaliacoes, imagens, 1, tipoProduto);

//		Curso curso = new Curso();
//		curso.setNome("Engenharia Software");
//		System.out.println("Nome do curso:" + curso.getNome());
//
//		Curso curso1 = new Curso();
//		curso1.setNome("Direito");
//		System.out.println("Nome do curso:" + curso1.getNome());
//
//		Curso curso2 = new Curso();
//		curso2.setNome("Medicina");
//		System.out.println("Nome do curso:" + curso2.getNome());

		System.out.println(produto);
	}

}
