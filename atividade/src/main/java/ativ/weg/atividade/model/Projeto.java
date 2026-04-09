package ativ.weg.atividade.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Projeto {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;


@ManyToMany(mappedBy = "projetos")
private List<Funcionario> funcionarios = new ArrayList<>();

private String nome;
}

