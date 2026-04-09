package ativ.weg.atividade.service;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import ativ.weg.atividade.model.Funcionario;
import ativ.weg.atividade.repository.FuncionarioRepository;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public List<Funcionario> listar() {
        return repository.findAll();
    }

    public Funcionario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));
    }

    public Funcionario salvar(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public Funcionario atualizar(Long id, Funcionario novo) {
        Funcionario f = buscarPorId(id);

        f.setNome(novo.getNome());
        f.setAssento(novo.getAssento());
        f.setProjetos(novo.getProjetos());

        return repository.save(f);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}