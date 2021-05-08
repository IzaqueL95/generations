package org.generation.blogPessoal.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.Array;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "tb_tema")
public class Tema {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String descricao;
											//CascedType.all indica que se por exemplo eu excluir um tema
												//todas as postagens com aquele tema serão afetadas
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL) //mappedBy indica qual tabela estamos mapeando
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem = new ArrayList<>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Postagem> getPostagem() {
		return postagem;
	}
	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	

	


}
