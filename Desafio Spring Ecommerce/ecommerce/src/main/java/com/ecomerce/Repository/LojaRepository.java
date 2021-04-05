package com.ecomerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.model.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long> {
	
	public List<Loja> findAllByNomeContaining (String nome);

}
