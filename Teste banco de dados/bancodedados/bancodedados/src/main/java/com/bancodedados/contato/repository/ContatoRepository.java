package com.bancodedados.contato.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bancodedados.contato.model.ContatoModel;


public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
	

}
