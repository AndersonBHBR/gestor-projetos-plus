package com.anderson.gestorprojetosplus.repository;

import com.anderson.gestorprojetosplus.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
