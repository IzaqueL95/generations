package com.loja.LojaGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.LojaGames.Model.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContaining(String Produto);
	public List<Produto> findAllByPrecoContaining(Float produto);
	public List<Produto> findAllByFaixaContaining(String Produto);
}
