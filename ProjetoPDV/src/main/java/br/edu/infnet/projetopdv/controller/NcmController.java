package br.edu.infnet.projetopdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class NcmController {

	//NCM GET
	@GetMapping(value = "/Ncm")
	public String cadatro() {
		return "/Ncm/cadastro";
	}
	
}
