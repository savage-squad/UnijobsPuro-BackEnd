package br.uniamerica.unijobs.model;

public class Produto {
	private Integer id;
	
	public Produto() {
		
	}

	public Produto(Integer id) {
	
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
		return "Produto [id=" + id + "]";
	}
	

}
