package ativ.weg.atividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ativ.weg.atividade.model.Assento;

public interface AssentoRepository extends JpaRepository<Assento,Long> {
    
}
