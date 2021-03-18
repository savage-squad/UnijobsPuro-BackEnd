package br.uniamerica.unijobs.model;

public abstract class Pessoa {
	private String nome;
	private String celular;
	private int ra;
		
	public Pessoa() {
	}

	public Pessoa(String nome, String celular, int ra) {
		super();
		this.nome = nome;
		this.celular = celular;
		this.ra = ra;
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

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", celular=" + celular + ", ra=" + ra + "]";
	}
	
}
