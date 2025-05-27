import { Component, OnInit } from '@angular/core';
import { TarefaService } from '../tarefa.service';

@Component({
  selector: 'app-tarefa-list',
  template: `
    <div class="container mt-4">
      <h3>Tarefas</h3>
      <ul class="list-group">
        <li class="list-group-item" *ngFor="let tarefa of tarefas">
          <strong>{{ tarefa.titulo }}</strong> - {{ tarefa.descricao }} - 
          <span [class.text-success]="tarefa.concluida" [class.text-danger]="!tarefa.concluida">
            {{ tarefa.concluida ? 'Concluída' : 'Pendente' }}
          </span>
        </li>
      </ul>
    </div>
  `
})
export class TarefaListComponent implements OnInit {
  tarefas: any[] = [];

  constructor(private tarefaService: TarefaService) {}

  ngOnInit(): void {
    this.tarefaService.listar().subscribe(data => this.tarefas = data);
  }
}
