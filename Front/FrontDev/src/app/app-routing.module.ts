import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'home',
    loadChildren: './home/home.module#HomePageModule'
  },
  {
    path: 'list',
    loadChildren: './list/list.module#ListPageModule'
  },
  { path: 'evento', loadChildren: './evento/evento.module#EventoPageModule' },
  { path: 'sala', loadChildren: './sala/sala.module#SalaPageModule' },
  { path: 'setor', loadChildren: './setor/setor.module#SetorPageModule' },
  { path: 'tipo', loadChildren: './tipo/tipo.module#TipoPageModule' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
