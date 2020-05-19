package br.com.cervejaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cervejaria.estilo.Estilo;
import br.com.cervejaria.repository.EstiloRepository;

@RestController
@RequestMapping("/")
public class EstiloController {

	@Autowired
	private EstiloRepository repo;
	
	
	@PostMapping("/estilos")
	public void cadastro (@RequestBody Estilo estilo) {
		repo.save(estilo);
	}
	
	
	
	
}
