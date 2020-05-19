package br.com.cervejaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cervejaria.cliente.Cidade;
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
	
	@GetMapping("/estilos")
	public List<Estilo> getEstilo(){
		return repo.findAll();
		
	}
	
	@GetMapping("/estilos/{id}")
	public Estilo listId(@PathVariable("id")Long id) {
		return repo.findById(id).get();
		
	}
	
	@PutMapping("/estilos/{id}")
	public void update(@PathVariable("id") Long id, @RequestBody Estilo estilo) {
		Optional<Estilo> Estilo = repo.findById(id);
		estilo.setId(id);
		repo.save(estilo);
	}
	
	@DeleteMapping("estilos/{id}")
	public void deletar(@PathVariable("id") Long id, @RequestBody Estilo estilo) {
		repo.deleteById(id);
	}
	
}
