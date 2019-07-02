import { Component, OnInit } from '@angular/core';
import { setor } from '../config';
import { NavController } from '@ionic/angular';
import { ProviderService } from '../provider.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-setor',
  templateUrl: './setor.page.html',
  styleUrls: ['./setor.page.scss'],
})
export class SetorPage implements OnInit {
  setor: setor
  constructor(public navCtrl: NavController, public provider: ProviderService, public atvRoute: ActivatedRoute) {
    this.setor = new setor
  }
  ngOnInit() {
  }
  ionViewDidEnter() {
    let id = this.atvRoute.snapshot.paramMap.get("id")
    if (id != "0") {
      this.provider.GetSetor(id).then(ret => {
        this.setor = ret
      }).catch(erro => {
        alert("Deu ruim:" + erro)
      })
    }
  }

  save() {
    this.provider.PostSetor(this.setor).then(() => {
      alert("Salvo com sucesso!")
      this.navCtrl.navigateForward("home")
    }).catch(erro => {
      alert("Não Salvou:" + erro)
    })
  }
}


