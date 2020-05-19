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

import br.com.cervejaria.estilo.Cerveja;
import br.com.cervejaria.estilo.Estilo;
import br.com.cervejaria.repository.CervejaRepository;

@RestController
@RequestMapping("/")
public class CervejaController {

	@Autowired
	private CervejaRepository repo;
	
	@PostMapping("/cervejas")
	public void cadastro (@RequestBody Cerveja cerveja) {
		repo.save(cerveja);
		
	}
	
	@GetMapping("/cervejas")
	public List<Cerveja> getCerveja(){
		return repo.findAll();
	} 
	
	@GetMapping("/cervejas/{id}")
	public Cerveja listId(@PathVariable("id")Long id) {
		return repo.findById(id).get();
	} 
	
	@PutMapping("/cervejas/{id}")
	public void update(@PathVariable("id") Long id, @RequestBody Cerveja cerveja) {
		Optional<Cerveja> Cerveja = repo.findById(id);
		cerveja.setId(id);
		repo.save(cerveja);
	}
	
	@DeleteMapping("/cervejas/{id}")
	public void delete(@PathVariable("id") Long id, @RequestBody Cerveja cerveja) {
		repo.deleteById(id);
	}
	
}
