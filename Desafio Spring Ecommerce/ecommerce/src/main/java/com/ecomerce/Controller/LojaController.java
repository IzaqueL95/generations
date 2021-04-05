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

import com.ecomerce.Repository.LojaRepository;
import com.ecomerce.model.Loja;

@RestController
@RequestMapping("/loja")
@CrossOrigin("*")
public class LojaController {
	
	@Autowired
	private LojaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Loja>> getAll ()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Loja>> getByName (@Valid @PathVariable String nome)
	{
		return ResponseEntity.ok(repository.findAllByNomeContaining(nome));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Loja> getById (@PathVariable Long idLoja)
	{
		return repository.findById(idLoja)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Loja> post (@Valid @RequestBody Loja loja)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(loja));
	}
	
	@PutMapping
	public ResponseEntity<Loja> put (@Valid @RequestBody Loja loja)
	{
		return ResponseEntity.ok(repository.save(loja));
	}
	
	@DeleteMapping("/{idloja}")
	public void delete (@PathVariable Long idLoja)
	{
		repository.deleteById(idLoja);
	}

}
