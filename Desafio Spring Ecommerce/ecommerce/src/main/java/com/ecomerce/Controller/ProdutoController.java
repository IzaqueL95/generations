package com.ecomerce.Controller;

import java.util.List;

import javax.validation.Valid;

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

import com.ecomerce.Repository.ProdutoRepository;
import com.ecomerce.model.Produto;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {

	@Autowired 
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll ()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nome")
	public ResponseEntity<List<Produto>> GetByName()
	{
		return ResponseEntity.ok(repository.findByNome());
	}
	
	@GetMapping("/nomeb")
	public ResponseEntity<List<Produto>> GetByNameComecaB()
	{
		return ResponseEntity.ok(repository.findByNomeComecaB());
	}
	
	@GetMapping("/preco")
	public ResponseEntity<List<Produto>> GetByPrecoMaior (String precomaior)
	{
		return ResponseEntity.ok(repository.findAllByPrecoBatatinhas(precomaior));
	}
	
	@GetMapping("/precomenor")
	public ResponseEntity<List<Produto>> GetByPreco(String preco)
	{
		return ResponseEntity.ok(repository.findAllByPreco(preco));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post (@Valid @RequestBody Produto produto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put (@Valid @RequestBody Produto produto)
	{
		return ResponseEntity.ok(repository.save(produto));
	}
	
	@DeleteMapping("/id/{id}")
	public void delete (@PathVariable Long id)
	{
		repository.deleteById(id);
	}

	
}
