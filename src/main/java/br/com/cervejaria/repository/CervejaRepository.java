package br.com.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cervejaria.estilo.Cerveja;

@Repository
@Transactional
public interface CervejaRepository extends JpaRepository<Cerveja, Long> {

	
	
}
