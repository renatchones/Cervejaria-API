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

import br.com.cervejaria.estilo.Estilo;
import br.com.cervejaria.repository.VendaRepository;
import br.com.cervejaria.venda.Venda;

@RestController
@RequestMapping("/")
public class VendaController {

	@Autowired
	private VendaRepository repo;
	
	@PostMapping("/vendas")
	public void cadastro(@RequestBody Venda venda) {
		repo.save(venda);
	}
	
	@GetMapping("/vendas")
	public List<Venda> getVenda(){
		return repo.findAll();
	}
	
	@GetMapping("vendas/{id}")
	public Venda listId(@PathVariable("id")Long id, @RequestBody Venda venda) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/vendas/{id}")
	public void update(@PathVariable("id") Long id, @RequestBody Venda venda) {
		Optional<Venda> Venda = repo.findById(id);
		venda.setId(id);
		repo.save(venda);
	}
	
	@DeleteMapping("/vendas/{id}")
	public void delete(@PathVariable("id")Long id, @RequestBody Venda venda) {
		repo.deleteById(id);
		
	}
	
	
}
