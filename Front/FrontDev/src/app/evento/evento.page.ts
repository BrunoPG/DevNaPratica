import { Component, OnInit } from '@angular/core';
import { evento } from '../config';
import { ProviderService } from '../provider.service';
import { ActivatedRoute } from '@angular/router';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-evento',
  templateUrl: './evento.page.html',
  styleUrls: ['./evento.page.scss'],
})
export class EventoPage implements OnInit {
  evento: evento
  constructor(public navCtrl: NavController, public provider: ProviderService, public atvRoute: ActivatedRoute) {
    this.evento = new evento
  }

  ngOnInit() {
  }
  ionViewDidEnter() {
    let id = this.atvRoute.snapshot.paramMap.get("id")
    if (id != "0") {
      this.provider.GetEvento(id).then(ret => {
        this.evento = ret
      }).catch(erro => {
        alert("Deu ruim:" + erro)
      })
    }
  }

  save() {
    this.evento.nome = "nome"
    this.evento.descricao = "descricao"
    this.provider.PostEvento(this.evento).then(() => {
      alert("Salvo com sucesso!")
      this.navCtrl.navigateForward("home")
    }).catch(erro => {
      alert("Não Salvou:" + erro)
    })
  }
}
