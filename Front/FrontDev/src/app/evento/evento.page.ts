import { Component, OnInit } from '@angular/core';
import { evento } from '../config';

@Component({
  selector: 'app-evento',
  templateUrl: './evento.page.html',
  styleUrls: ['./evento.page.scss'],
})
export class EventoPage implements OnInit {
evento:evento
  constructor() { 
    this.evento = new evento
  }

  ngOnInit() {
  }

}
