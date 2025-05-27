package com.anderson.gestorprojetosplus.controller;

import com.anderson.gestorprojetosplus.model.Projeto;
import com.anderson.gestorprojetosplus.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoRepository projetoRepo;

    @GetMapping
    public List<Projeto> listar() {
        return projetoRepo.findAll();
    }

    @PostMapping
    public Projeto criar(@RequestBody Projeto projeto) {
        return projetoRepo.save(projeto);
    }
}
