package ativ.weg.atividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ativ.weg.atividade.model.Funcionario;

@Repository
public interface ProjetoRepository extends JpaRepository<Funcionario,Long> {
    
    
}
