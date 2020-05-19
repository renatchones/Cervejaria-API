package br.com.cervejaria.dao;

import java.util.List;

import br.com.cervejaria.estilo.Cerveja;
import br.com.cervejaria.estilo.Estilo;



public interface CervejaDao {
	
	public void save(Cerveja cerveja);

	
	public void update(Cerveja cerveja); 
		
	
	public void delete(Long id); 
	
	Cerveja findById(Long id);
	
	List<Cerveja> findAll();
	
	
	
	
}
