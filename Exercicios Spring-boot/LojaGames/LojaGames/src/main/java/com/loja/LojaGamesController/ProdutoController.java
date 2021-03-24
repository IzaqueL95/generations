package com.loja.LojaGamesController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.loja.LojaGames.Model.Produto;
import com.loja.LojaGames.Repository.ProdutoRepository;


@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired 
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> Getall ()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable long id)
	{
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> GetByNome(@PathVariable String nome)
	{
		return ResponseEntity.ok(repository.findAllByNomeContaining(nome));
	}
	
	@GetMapping("/preco/{preco}")
	public ResponseEntity<List<Produto>> GetByPreco(@RequestBody Float preco)
	{
		return ResponseEntity.ok(repository.findAllByPrecoContaining(preco));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post (@RequestBody Produto produto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	
}
