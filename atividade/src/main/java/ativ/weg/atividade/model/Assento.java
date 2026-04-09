package ativ.weg.atividade.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

public class Assento {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String codigo;

@OneToOne (mappedBy = "assento")
private Funcionario funcionario;

}