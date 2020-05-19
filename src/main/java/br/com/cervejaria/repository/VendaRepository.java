package br.com.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cervejaria.venda.Venda;

@Repository
@Transactional
public interface VendaRepository extends JpaRepository<Venda, Long> {

	
	
}
