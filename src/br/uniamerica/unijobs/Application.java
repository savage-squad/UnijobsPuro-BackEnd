package br.uniamerica.unijobs;

import br.uniamerica.unijobs.model.Curso;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso curso = new Curso();
		curso.setNome("Engenharia Software");
		System.out.println("Nome do curso:" + curso.getNome());
		
		Curso curso1 = new Curso();
		curso1.setNome("Direito");
		System.out.println("Nome do curso:" + curso1.getNome());
		
		Curso curso2 = new Curso();
		curso2.setNome("Medicina");
		System.out.println("Nome do curso:" + curso2.getNome());

	}

}
