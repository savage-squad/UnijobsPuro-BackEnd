package br.uniamerica.unijobs.model;

public abstract class Pessoa {
	private String nome;
	private String celular;
	private int ra;
	private Universidade universidade;
	private Curso curso;
		
	public Pessoa() {
	}

	public Pessoa(String nome, String celular, int ra, Universidade universidade, Curso curso) {
		this.nome = nome;
		this.celular = celular;
		this.ra = ra;
		this.universidade = universidade;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				", celular='" + celular + '\'' +
				", ra=" + ra +
				", universidade=" + universidade +
				", curso=" + curso +
				'}';
	}

}
