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

import br.com.cervejaria.cliente.Cliente;
import br.com.cervejaria.repository.ClienteRepository;

@RestController
@RequestMapping("/")
public class ClienteController {

	@Autowired
	private ClienteRepository repo;
	
	@PostMapping("/clientes")
	public void cadastro(@RequestBody Cliente cliente) {
		repo.save(cliente);
		
	}
	
	@GetMapping("/clientes")
	public List<Cliente> getCliente(){
		return repo.findAll();
		
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente listId(@PathVariable("id")Long id) {
		return repo.findById(id).get();
	}
	
	@PutMapping("/cliente/{id}")
	public void update(@PathVariable("id")Long id,@RequestBody Cliente cliente) {
		Optional<Cliente> Cliente = repo.findById(id);
		cliente.setId(id);
		repo.save(cliente);
	}
	
	public void delete(@PathVariable("id")Long id) {
		repo.deleteById(id);
	}
	
}
