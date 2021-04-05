package com.ecomerce.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nome;
	
	@NotNull
	private Float preco;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_loja_id")
	@JsonIgnoreProperties({"idLoja","produtosDaLoja","usuarioCliente"})
	private Loja daLoja;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_usuario_id")
	@JsonIgnoreProperties({"senha","meusProdutos","minhasLojas","idUsuario"})
	private Usuario usuarioComprador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Loja getDaLoja() {
		return daLoja;
	}

	public void setDaLoja(Loja daLoja) {
		this.daLoja = daLoja;
	}

	public Usuario getUsuarioComprador() {
		return usuarioComprador;
	}

	public void setUsuarioComprador(Usuario usuarioComprador) {
		this.usuarioComprador = usuarioComprador;
	}

	

	
}
