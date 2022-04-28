package br.edu.infnet.projetopdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class NcmController {

	@GetMapping(value = "/Ncm")
	public String Cadatro() {
		return "/Ncm/Cadastro";
	}	
	
	@GetMapping(value = "/Ncms")
	public String Lista() {
		return "/Ncm/Lista";
	}	
	
	@PostMapping(value = "/Ncm/incluir")
	public String incluir() {
		return "/Ncm/Lista";
	}
	
}
