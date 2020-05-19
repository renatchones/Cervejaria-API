package br.com.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cervejaria.venda.ItenVenda;

@Repository
@Transactional
public interface ItenVendaRepository extends JpaRepository<ItenVenda, Long> {

	
	
}
