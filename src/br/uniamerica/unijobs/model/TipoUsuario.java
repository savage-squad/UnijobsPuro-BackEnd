package br.uniamerica.unijobs.model;

public class TipoUsuario {
	private Integer id;
	private String nome;
	
	public TipoUsuario() {
	}

	public TipoUsuario(Integer id, String tipo) {
		this.id = id;
		this.nome = nome;
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

	@Override
	public String toString() {
		return "TipoUsuario{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				'}';
	}
}
