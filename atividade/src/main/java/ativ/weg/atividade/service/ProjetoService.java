package ativ.weg.atividade.service;


import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import ativ.weg.atividade.model.Projeto;
import ativ.weg.atividade.repository.ProjetoRepository;

@Service
@RequiredArgsConstructor
public class ProjetoService {

    private final ProjetoRepository repository;

    public List<Projeto> listar() {
        return repository.findAll();
    }

    public Projeto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
    }

    public Projeto salvar(Projeto projeto) {
        return repository.save(projeto);
    }

    public Projeto atualizar(Long id, Projeto novo) {
        Projeto p = buscarPorId(id);

        p.setNome(novo.getNome());

        return repository.save(p);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}