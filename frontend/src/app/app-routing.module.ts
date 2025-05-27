import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './auth/login/login.component';
import { AuthGuard } from './auth/auth.guard';
import { ProjetoListComponent } from './projeto/projeto-list/projeto-list.component';
import { TarefaListComponent } from './tarefa/tarefa-list/tarefa-list.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'projetos', component: ProjetoListComponent, canActivate: [AuthGuard] },
  { path: 'tarefas', component: TarefaListComponent, canActivate: [AuthGuard] },
  { path: '**', redirectTo: 'login' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
