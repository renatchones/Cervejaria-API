package br.com.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cervejaria.cliente.Cidade;

@Repository
@Transactional
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	
	
}
