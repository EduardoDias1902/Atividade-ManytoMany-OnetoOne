package ativ.weg.atividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ativ.weg.atividade.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
    
}
