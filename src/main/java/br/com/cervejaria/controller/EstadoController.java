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


import br.com.cervejaria.cliente.Estado;
import br.com.cervejaria.repository.EstadoRepository;

@RestController
@RequestMapping("/")
public class EstadoController {

	@Autowired
	private EstadoRepository repo;
	
	@PostMapping("/estados")
	public void cadastro(@RequestBody Estado estado) {
		repo.save(estado);
		
	}
	
	@GetMapping("/estados")
	public List<Estado> getEstado(){
		return repo.findAll();
		
	}
	
	@GetMapping("/estados/{id}")
	public Estado listId(@PathVariable("id")Long id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/estados/{id}")
	public void update(@PathVariable("id")Long id,@RequestBody Estado estado) {
		Optional<Estado> Estado = repo.findById(id);
		estado.setId(id);
		repo.save(estado);
	}
	@DeleteMapping("/estados/{id}")
	public void delete(@PathVariable("id")Long id) {
		repo.deleteById(id);
	}
	
}
