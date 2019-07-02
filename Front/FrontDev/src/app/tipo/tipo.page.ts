import { Component, OnInit } from '@angular/core';
import { tipo } from '../config';
import { ActivatedRoute } from '@angular/router';
import { ProviderService } from '../provider.service';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-tipo',
  templateUrl: './tipo.page.html',
  styleUrls: ['./tipo.page.scss'],
})
export class TipoPage implements OnInit {

  tipo: tipo
  constructor(public navCtrl: NavController, public provider: ProviderService, public atvRoute: ActivatedRoute) {
    this.tipo = new tipo()
  }

  ngOnInit() {
  }
  ionViewDidEnter() {
    let id = this.atvRoute.snapshot.paramMap.get("id")
    if (id != "0") {
      this.provider.GetTipo(id).then(ret => {
        this.tipo = ret
      }).catch(erro => {
        alert("Deu ruim:" + erro)
      })
    }
  }

  save() {
    console.log(tipo);
    this.provider.PostTipo(this.tipo).then(() => {
      alert("Salvo com sucesso!")
      this.navCtrl.navigateForward("home")
    }).catch(erro => {
      alert("Não Salvou:" + erro)
    })
  }

}
