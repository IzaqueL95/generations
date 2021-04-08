package com.bancodedados.dbaRepository;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.bancodedados.model.ContatoModel;

	public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

	}

