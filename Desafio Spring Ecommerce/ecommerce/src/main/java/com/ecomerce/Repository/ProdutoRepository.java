package com.ecomerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecomerce.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	//Método para buscar nomes que contem 'b' dentro da tabela
	@Query(value = "SELECT * FROM tb_produto WHERE nome LIKE '%b%'", nativeQuery = true)
	public List<Produto> findByNome();
	
	//Método para buscar nomes que começam com a letra 'b' dentro da tabela
	@Query(value = "SELECT * FROM tb_produto WHERE nome LIKE 'b%'", nativeQuery = true)
	public List<Produto> findByNomeComecaB();
	
	//Método para selecionar produtos cujo valor é superior '>' ou igual '=' a '45'
	@Query(value = "SELECT * FROM tb_produto WHERE preco >= 45", nativeQuery = true)
	public List<Produto> findAllByPrecoBatatinhas (String precomaior);
	
	//Método para selecionar produtos cujo valor é superior '>' a '5' e inferior '<' ou igual '=' a '45'
	@Query(value = "SELECT * FROM tb_produto WHERE preco >5 AND preco <=45", nativeQuery = true)
	public List<Produto> findAllByPreco (String Preco);
	
}
