import { Component, OnInit } from '@angular/core';
import { tipo } from '../config';

@Component({
  selector: 'app-tipo',
  templateUrl: './tipo.page.html',
  styleUrls: ['./tipo.page.scss'],
})
export class TipoPage implements OnInit {

  tipo: tipo
  constructor() {
    this.tipo = new  tipo()
   }

  ngOnInit() {
  }

}
