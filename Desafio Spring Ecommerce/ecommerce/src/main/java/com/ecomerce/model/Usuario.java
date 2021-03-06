package com.ecomerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;

	
	private String nome;
	
	
	@Size(min = 5, max = 12)
	private String usuario;
	
	
	@Size(min =6, max = 15)
	private String senha;
	
	
	
	@ManyToMany(mappedBy = "usuarioCliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Loja> minhasLojas = new ArrayList<>();
	
	@OneToMany(mappedBy = "usuarioComprador")
	@JsonIgnoreProperties({"usuarioComprador","daLoja","id","preco"})
	private List<Produto> meusProdutos = new ArrayList<>();

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Loja> getMinhasLojas() {
		return minhasLojas;
	}

	public void setMinhasLojas(List<Loja> minhasLojas) {
		this.minhasLojas = minhasLojas;
	}

	public List<Produto> getMeusProdutos() {
		return meusProdutos;
	}

	public void setMeusProdutos(List<Produto> meusProdutos) {
		this.meusProdutos = meusProdutos;
	}


	

	
	
	
}
