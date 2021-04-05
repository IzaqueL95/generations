package com.ecomerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_loja")
public class Loja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLoja;
	
	
	private String nome;
	
	
	private String descricao;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "inscrições",
			joinColumns =  @JoinColumn(name = "idLoja"),
			inverseJoinColumns = @JoinColumn(name = "idUsuario"))
	private List<Usuario> usuarioCliente = new ArrayList<>();

	@OneToMany(mappedBy = "daLoja")
	@JsonIgnoreProperties({"usuarioComprador","daLoja","produtosDaLoja"})
	private List<Produto> produtosDaLoja = new ArrayList<>();

	public Long getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(Long idLoja) {
		this.idLoja = idLoja;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Usuario> getUsuarioCliente() {
		return usuarioCliente;
	}

	public void setUsuarioCliente(List<Usuario> usuarioCliente) {
		this.usuarioCliente = usuarioCliente;
	}

	public List<Produto> getProdutosDaLoja() {
		return produtosDaLoja;
	}

	public void setProdutosDaLoja(List<Produto> produtosDaLoja) {
		this.produtosDaLoja = produtosDaLoja;
	}
	
	
	
	

}
