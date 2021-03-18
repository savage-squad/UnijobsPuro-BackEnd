package br.uniamerica.unijobs.model;

public class Universidade {
	private Integer id;
	private String nome;
	private String cnpj;
	
	public Universidade() {	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Universidade [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + "]";
	}

}
