package br.uniamerica.unijobs.model;

import java.util.ArrayList;

public class Servico extends Anuncio{
	private Integer id;
	private TipoServico tipoServico;
	
	public Servico(String string) {
	
	}

	public Servico(Integer id, Usuario usuario, String titulo, String descricao, Double preco, String miniatura, Boolean ativo, ArrayList<Avaliacao> avaliacoes, ArrayList<Imagem> imagens, Integer id1, TipoServico tipoServico) {
		super(id, usuario, titulo, descricao, preco, miniatura, ativo, avaliacoes, imagens);
		this.id = id1;
		this.tipoServico = tipoServico;
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public static void setId(Integer id) {
		this.id = id;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	@Override
	public String toString() {
		return "Servico{" +
				"id=" + id +
				", tipoServico=" + tipoServico +
				'}';
	}


}
