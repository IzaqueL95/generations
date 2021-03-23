package com.farmacia.farmaciadobem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.farmaciadobem.model.produto;

public interface produtoRepository extends JpaRepository<produto, Long> {
	public List<produto> findAllByNomeContaining(String produto);
	public List<produto> findAllByPrecoContaining(Float produto);
	public List<produto> findAllByMarcaContaining(String produto);

}
