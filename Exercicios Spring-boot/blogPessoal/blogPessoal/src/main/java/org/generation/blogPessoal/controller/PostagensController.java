package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //INFORMA QUE ESSA CLASSE SE TRATA DE UM CONTROLADOR
@RequestMapping("/postagens")
@CrossOrigin("*") //INDICA QUE A CLASSE VAI ACEITAR REQUISIÇÕES DO FRONT DE QUALQUER ORIGEM, ANGULAR, REACT..
public class PostagensController {
	
	@Autowired // SERVE PRA EU CONSEGUIR INSTANCIAR A INTERFACE ABAIXO, POIS NÃO É POSSIVEL INSTANCIAR NORMALMENTE
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> Getall (){
		return ResponseEntity.ok(repository.findAll());
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id){  //PachVariable serve pra indicar que queremos o valor pela URL
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
	return ResponseEntity.ok(repository.findAllByTituloContaining(titulo));
	
	}
}
