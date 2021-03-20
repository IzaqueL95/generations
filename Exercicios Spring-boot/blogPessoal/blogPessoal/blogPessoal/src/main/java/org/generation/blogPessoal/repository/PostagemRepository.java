package org.generation.blogPessoal.repository;
//ÉSSA CAMADA REPOSITORY SERVE PARA A COMUNICAÇÃO COM O BANCO DE DADOS
import java.util.List;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository		 										//<entidade, classe> 
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTituloContaining (String titulo); //Metodo para trazer tudo que tem dentro do titulo, o IgnoreCase é para ignorar maiusula, e considerar o que está sendo chamado.

	
}

