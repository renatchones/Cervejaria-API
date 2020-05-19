package br.com.cervejaria.dao;

import java.util.List;

import br.com.cervejaria.cliente.Cidade;



public interface CidadeDao {
	
	public void save(Cidade cidade );

	
	public void update(Cidade cidade); 
		
	
	public void delete(Long id); 
	
	Cidade findById(Long id);
	
	List<Cidade> findAll();
	
	
	
	
}
