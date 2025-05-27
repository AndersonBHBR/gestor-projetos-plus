package com.anderson.gestorprojetosplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private boolean concluida;

    private LocalDate prazo;

    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;
}
