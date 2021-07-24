package com.halloword.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")

public class HalloController {
	
	@GetMapping ("/BSM")
		
	public String hello() {
		return "\nHabilidades e mentalidades que eu utilizei nesse exercício com certeza foi Persistência e Comunicação";
	}
	
	@GetMapping("/Objetivo")
	public String Objetivos() {
		return "\nTenho por objetivo aplicar os conceitos compreendidos ao meu projeto final proposto pelo curso";
	}
	
}
