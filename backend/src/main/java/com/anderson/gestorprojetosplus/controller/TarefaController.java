package com.anderson.gestorprojetosplus.controller;

import com.anderson.gestorprojetosplus.model.Tarefa;
import com.anderson.gestorprojetosplus.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepo;

    @GetMapping
    public List<Tarefa> listar() {
        return tarefaRepo.findAll();
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return tarefaRepo.save(tarefa);
    }
}
