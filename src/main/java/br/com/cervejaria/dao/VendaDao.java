package br.com.cervejaria.dao;

import java.util.List;

import br.com.cervejaria.venda.Venda;



public interface VendaDao {
	
	public void save(Venda venda);

	
	public void update(Venda venda); 
		
	
	public void delete(Long id); 
	
	Venda findById(Long id);
	
	List<Venda> findAll();
	
	
	
	
}
