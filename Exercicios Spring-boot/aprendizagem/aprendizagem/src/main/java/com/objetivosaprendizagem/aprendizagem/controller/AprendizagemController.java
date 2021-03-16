package com.objetivosaprendizagem.aprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizagens")

public class AprendizagemController {
	@GetMapping
	public String aprendizagem ()
	{
		return "Meus objetivos de aprendizagens dessa semana são persistência e atenção aos detalhes";
	}

}
