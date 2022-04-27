package br.edu.infnet.projetopdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class AcessoController {
	
      @GetMapping(value = "/")	
	public String telaLogin() {
		return "Login";
	}
	

      @PostMapping(value = "/Login")
	public String Login(Model model, @RequestParam String email, @RequestParam String senha) {
  	  
  	  if(email.equalsIgnoreCase(senha)) {
  		  return "index";
  	  }
  	  
  	  String msg = email + "Informações invalidas";
  	  
  	  model.addAttribute("mensagem", msg);
    	  
		return "Login";
	}

}
