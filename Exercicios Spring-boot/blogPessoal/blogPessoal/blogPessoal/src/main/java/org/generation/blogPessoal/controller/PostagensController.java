package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/titulo/{titulo}") //responseEntity significa que ele devolve o que esta dentro de postagem em Entity 
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
	return ResponseEntity.ok(repository.findAllByTituloContaining(titulo));
	
	}
	//para o método POST não passamos o ID no POSTMAN, pois ele é auto increment
	@PostMapping					//post porque é putmapping
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem) //@RequestBody significa que conseguimos pegar o que esta no corpo da requisição
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	// para o método PUT passamos o ID no postman para dizer qual queremos alterar
	@PutMapping                    //put porque é putmapping
	public ResponseEntity<Postagem> put (@RequestBody Postagem postagem) //@RequestBody significa que conseguimos pegar o que esta no corpo da requisição
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	@DeleteMapping ("/{id}")
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	}
	
	

}
