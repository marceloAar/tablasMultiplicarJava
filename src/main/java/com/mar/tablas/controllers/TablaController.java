package com.mar.tablas.controllers;

import java.util.ArrayList;
import java.util.List;

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
	public String consulta(@RequestParam(value = "numero") String numero, Model model){		
		
		//Integer mostrarDiv = 0;
		
		if (numero.equals("0")) {
			//mostrarDiv = 1;
			model.addAttribute("validar", "Ingrese un número mayor a cero.");
			return "index";
		} 
		  
		if(numero.equals("")) {
			//mostrarDiv = 1;
			model.addAttribute("validar", "Debe ingresar un valor, campo no debe estar vacio.");		
			return "index"; 
		}
		
		Integer num = Integer.parseInt(numero);	
		model.addAttribute("numero", num);
		
		List<Integer> listaN = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			listaN.add(i);
		}
		
		//mostrarDiv = false;				
		model.addAttribute("multi", listaN);
		return "tablas";	
		
	}		
	
}
