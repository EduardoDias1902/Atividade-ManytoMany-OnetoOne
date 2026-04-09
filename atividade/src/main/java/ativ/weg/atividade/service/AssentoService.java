package ativ.weg.atividade.service;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import ativ.weg.atividade.model.Assento;
import ativ.weg.atividade.repository.AssentoRepository;

@Service
@RequiredArgsConstructor
public class AssentoService {

    private final AssentoRepository repository;

    public List<Assento> listar() {
        return repository.findAll();
    }

    public Assento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Assento não encontrado"));
    }

    public Assento salvar(Assento assento) {
        return repository.save(assento);
    }

    public Assento atualizar(Long id, Assento novo) {
        Assento a = buscarPorId(id);

        a.setCodigo(novo.getCodigo());

        return repository.save(a);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}