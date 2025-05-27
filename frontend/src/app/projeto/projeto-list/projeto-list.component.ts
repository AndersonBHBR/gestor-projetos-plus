import { Component, OnInit } from '@angular/core';
import { ProjetoService } from '../projeto.service';

@Component({
  selector: 'app-projeto-list',
  template: `
    <div class="container mt-4">
      <h3>Projetos</h3>
      <ul class="list-group">
        <li class="list-group-item" *ngFor="let projeto of projetos">
          <strong>{{ projeto.nome }}</strong> - {{ projeto.descricao }}
        </li>
      </ul>
    </div>
  `
})
export class ProjetoListComponent implements OnInit {
  projetos: any[] = [];

  constructor(private projetoService: ProjetoService) {}

  ngOnInit(): void {
    this.projetoService.listar().subscribe(data => this.projetos = data);
  }
}
