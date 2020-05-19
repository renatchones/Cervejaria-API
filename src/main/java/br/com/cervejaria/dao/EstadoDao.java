package br.com.cervejaria.dao;

import java.util.List;

import br.com.cervejaria.cliente.Estado;
import br.com.cervejaria.estilo.Cerveja;



public interface EstadoDao {
	
	public void save(Estado estado);

	
	public void update(Estado estado); 
		
	
	public void delete(Long id); 
	
	Estado findById(Long id);
	
	List<Estado> findAll();
	
	
	
	
}
