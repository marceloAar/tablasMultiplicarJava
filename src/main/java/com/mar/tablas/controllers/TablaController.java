package com.mar.tablas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class TablaController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	
	@PostMapping("/consultar")
	public String consulta(@RequestParam(value = "numero") Integer numero, Model model){
				
		model.addAttribute("numero", numero);
		
		
		return "tablas";
	}
	
	
	
}
