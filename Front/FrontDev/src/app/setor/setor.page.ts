import { Component, OnInit } from '@angular/core';
import { setor } from '../config';

@Component({
  selector: 'app-setor',
  templateUrl: './setor.page.html',
  styleUrls: ['./setor.page.scss'],
})
export class SetorPage implements OnInit {
  setor: setor
  constructor() { 
this.setor = new setor
}
ngOnInit() {
  }

}
