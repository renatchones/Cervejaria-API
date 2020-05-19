package br.com.cervejaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cervejaria.cliente.Cidade;
import br.com.cervejaria.cliente.Estado;
import br.com.cervejaria.repository.CidadeRepository;

@RestController
@RequestMapping("/")
public class CidadeController {

	@Autowired
	private CidadeRepository repo;
	
	@PostMapping("/cidades")
	public void cadastro(@RequestBody Cidade cidade) {
		repo.save(cidade);
		
	}
	
	@GetMapping("/cidades")
	public List<Cidade> getCidade(){
		return repo.findAll();
		
	}
	
	@GetMapping("/cidades/{id}")
	public Cidade listId(@PathVariable("id")Long id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/cidades/{id}")
	public void update(@PathVariable("id")Long id,@RequestBody Cidade cidade) {
		Optional<Cidade> Cidade = repo.findById(id);
		cidade.setId(id);
		repo.save(cidade);
	}
	
	public void delete(@PathVariable("id")Long id) {
		repo.deleteById(id);
	}
	
}
