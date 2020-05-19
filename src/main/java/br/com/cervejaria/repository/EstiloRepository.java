package br.com.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cervejaria.estilo.Estilo;

@Repository
@Transactional
public interface EstiloRepository extends JpaRepository<Estilo, Long> {

	
	
}
