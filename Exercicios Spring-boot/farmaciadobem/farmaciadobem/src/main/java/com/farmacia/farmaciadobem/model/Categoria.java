package com.farmacia.farmaciadobem.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 3000)
	private String medicamento;
	
	@NotNull
	@Size(min = 5, max = 3000)
	private String cosmetico;
	
	@NotNull
	@Size(min = 5, max = 3000)
	private String primeirosSocorros;
	
	@OneToMany(mappedBy = "categoria")
	@JsonIgnoreProperties({"categoria","nome","id","preco","marca"})

	private List<produto> produto;
	
	public long getId() {
		return id;
	}

	public List<produto> getProduto() {
		return produto;
	}

	public void setProduto(List<produto> produto) {
		this.produto = produto;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getCosmetico() {
		return cosmetico;
	}

	public void setCosmetico(String cosmetico) {
		this.cosmetico = cosmetico;
	}

	public String getPrimeirosSocorros() {
		return primeirosSocorros;
	}

	public void setPrimeirosSocorros(String primeirosSocorros) {
		this.primeirosSocorros = primeirosSocorros;
	}

}
