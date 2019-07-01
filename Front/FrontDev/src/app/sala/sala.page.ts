import { Component, OnInit } from '@angular/core';
import { sala } from '../config';

@Component({
  selector: 'app-sala',
  templateUrl: './sala.page.html',
  styleUrls: ['./sala.page.scss'],
})
export class SalaPage implements OnInit {
sala:sala
  constructor() {
    this.sala = new sala
   }

  ngOnInit() {
  }

}
