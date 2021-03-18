package br.uniamerica.unijobs.model;

public class Anuncio {
	private Integer id;
	private String titulo;
	private String descricao;
	private String miniatura;
	private Boolean ativo;
	
	public Anuncio() {
	}

	public Anuncio(Integer id, String titulo, String descricao, String miniatura, Boolean ativo) {
		
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.miniatura = miniatura;
		this.ativo = ativo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMiniatura() {
		return miniatura;
	}

	public void setMiniatura(String miniatura) {
		this.miniatura = miniatura;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Anuncio [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", miniatura=" + miniatura
				+ ", ativo=" + ativo + "]";
	}
	
}
