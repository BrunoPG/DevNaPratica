import { Component, OnInit } from '@angular/core';
import { sala } from '../config';
import { NavController } from '@ionic/angular';
import { ProviderService } from '../provider.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-sala',
  templateUrl: './sala.page.html',
  styleUrls: ['./sala.page.scss'],
})
export class SalaPage implements OnInit {
sala:sala
  constructor(public navCtrl: NavController, public provider: ProviderService, public atvRoute: ActivatedRoute) {
    this.sala = new sala
   }

  ngOnInit() {
  }
  ionViewDidEnter() {
    let id = this.atvRoute.snapshot.paramMap.get("id")
    if (id != "0") {
      this.provider.GetSala(id).then(ret => {
        this.sala = ret
      }).catch(erro => {
        alert("Deu ruim:" + erro)
      })
    }
  }

  save() {
    this.provider.PostSala(this.sala).then(() => {
      alert("Salvo com sucesso!")
      this.navCtrl.navigateForward("home")
    }).catch(erro => {
      alert("Não Salvou:" + erro)
    })
  }
}
