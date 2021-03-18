package br.uniamerica.unijobs.model;

public class Servico {
	private Integer id;
	
	public Servico() {
	
	}

	public Servico(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Servico [id=" + id + "]";
	}
	
	

}
