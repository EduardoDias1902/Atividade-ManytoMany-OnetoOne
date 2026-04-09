package ativ.weg.atividade.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ativ.weg.atividade.model.Assento;
import ativ.weg.atividade.service.AssentoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/assentos")
@RequiredArgsConstructor
public class AssentoController {

    private final AssentoService service;

    @GetMapping
    public ResponseEntity<List<Assento>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<Assento> criar(@RequestBody Assento a) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.salvar(a));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Assento> atualizar(@PathVariable Long id, @RequestBody Assento a) {
        return ResponseEntity.ok(service.atualizar(id, a));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}