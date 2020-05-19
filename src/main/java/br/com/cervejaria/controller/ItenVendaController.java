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

import br.com.cervejaria.repository.ItenVendaRepository;
import br.com.cervejaria.venda.ItenVenda;
import br.com.cervejaria.venda.Venda;

@RestController
@RequestMapping("/")
public class ItenVendaController {

	@Autowired
	private ItenVendaRepository repo;
	
	@PostMapping("/itenvendas")
	public void cadastro(@RequestBody ItenVenda itenVenda) {
		repo.save(itenVenda);
	}
	
	@GetMapping("/itenvendas")
	public List<ItenVenda> getItenVenda(){
		return repo.findAll();
	}
	
	@GetMapping("/itenvendas/{id}")
	public ItenVenda listId(@PathVariable("id")Long id, @RequestBody ItenVenda ItenVenda) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/itenvendas/{id}")
	public void update(@PathVariable("id") Long id, @RequestBody ItenVenda itenVenda) {
		Optional<ItenVenda> ItenVenda = repo.findById(id);
		itenVenda.setId(id);
		repo.save(itenVenda);
	}
	
	@DeleteMapping("/itenvendas/{id}")
	public void delete(@PathVariable("id")Long id, @RequestBody ItenVenda itenVenda) {
		repo.deleteById(id);
		
	}
	
	
}
