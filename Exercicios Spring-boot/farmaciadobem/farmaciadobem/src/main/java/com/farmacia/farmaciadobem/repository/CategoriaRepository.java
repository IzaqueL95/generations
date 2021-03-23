package com.farmacia.farmaciadobem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.farmaciadobem.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByMedicamentoContaining(String Categoria);
	public List<Categoria> findAllByCosmeticoContaining(String Categoria);
	public List<Categoria> findAllByPrimeirosSocorrosContaining(String Categoria);

}
