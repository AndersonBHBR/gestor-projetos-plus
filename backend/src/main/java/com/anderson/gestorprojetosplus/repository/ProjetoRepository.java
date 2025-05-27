package com.anderson.gestorprojetosplus.repository;

import com.anderson.gestorprojetosplus.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
