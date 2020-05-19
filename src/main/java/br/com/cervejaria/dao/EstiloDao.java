package br.com.cervejaria.dao;

import java.util.List;

import br.com.cervejaria.estilo.Estilo;



public interface EstiloDao {
	
	public void save(Estilo estilo);

	
	public void update(Estilo estilo); 
		
	
	public void delete(Long id); 
	
	Estilo findById(Long id);
	
	List<Estilo> findAll();
	
	
	
	
}
