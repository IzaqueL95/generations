package com.loja.LojaGamesController;

import java.util.List;


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

import com.loja.LojaGames.Model.Categoria;

import com.loja.LojaGames.Repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")

public class CategoriaController {
	
	@Autowired CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> Getall ()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> GetById (@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> GetByDescricao(@PathVariable String descricao)
	{
		return ResponseEntity.ok(repository.findAllByDescricaoContaining(descricao));
	}
	
	@GetMapping("/genero/{genero}")
	public ResponseEntity<List<Categoria>> GetBygenero(@PathVariable String genero)
	{
		return ResponseEntity.ok(repository.findAllByDescricaoContaining(genero));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria categoria)
	{
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(categoria));
	}
	@PutMapping
	public ResponseEntity<Categoria> put (@RequestBody Categoria categoria)
	{
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	}
}
