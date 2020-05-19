package br.com.cervejaria.dao;

import java.util.List;

import br.com.cervejaria.venda.ItenVenda;



public interface ItenVendaDao {
	
	public void save(ItenVenda itenVenda);

	
	public void update(ItenVenda itenVenda); 
		
	
	public void delete(Long id); 
	
	ItenVenda findById(Long id);
	
	List<ItenVenda> findAll();
	
	
	
	
}
