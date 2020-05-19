package br.com.cervejaria.dao;

import java.util.List;

import br.com.cervejaria.cliente.Cliente;
import br.com.cervejaria.estilo.Cerveja;



public interface ClienteDao {
	
	public void save(Cliente cliente);

	
	public void update(Cliente cliente); 
		
	
	public void delete(Long id); 
	
	Cliente findById(Long id);
	
	List<Cliente> findAll();
	
	
	
	
}
