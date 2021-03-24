package com.loja.LojaGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.LojaGames.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByDescricaoContaining(String categoria);
	public List<Categoria> findAllByGeneroContaining(String categoria);

}
