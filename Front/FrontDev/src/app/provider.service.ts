import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { reject } from 'q';

@Injectable({
  providedIn: 'root'
})
export class ProviderService {

  rota_service = "https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/entities/"
  headers: HttpHeaders
  constructor(public Http: HttpClient) {

    this.headers = new HttpHeaders().set('Authorization', 'Bearer 6d0ac404a1747115620ec8552ccc1ca0');
  }

  GetTipo(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.rota_service}tipo/` + id, { headers: this.headers }).subscribe((ret: any) => {
        resolve(ret)
      }, erro => {
        reject(erro.message)
      })
    })
  }
  GetEvento(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.rota_service}evento/` + id, { headers: this.headers }).subscribe((ret: any) => {
        resolve(ret)
      }, erro => {
        reject(erro.message)
      })
    })
  }
  GetSala(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.rota_service}sala/` + id, { headers: this.headers }).subscribe((ret: any) => {
        resolve(ret)
      }, erro => {
        reject(erro.message)
      })
    })
  }
  GetSetor(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.rota_service}setor/` + id, { headers: this.headers }).subscribe((ret: any) => {
        resolve(ret)
      }, erro => {
        reject(erro.message)
      })
    })
  }
  PostTipo(tipo): Promise<any> {
    return new Promise(resolve => {
      this.Http.post(`${this.rota_service}tipo`, tipo, { headers: this.headers }).subscribe((ret: any) => {
        resolve(ret)
      }, erro => {
        reject(erro.message)
      })
    })
  }
  PostEvento(evento): Promise<any> {
    return new Promise(resolve => {
      this.Http.post(`${this.rota_service}evento`, evento, { headers: this.headers }).subscribe((ret: any) => {
        resolve(ret)
      }, erro => {
        reject(erro.message)
      })
    })
  }
  PostSala(sala): Promise<any> {
    return new Promise(resolve => {
      this.Http.post(`${this.rota_service}sala`, sala, { headers: this.headers }).subscribe((ret: any) => {
        resolve(ret)
      }, erro => {
        reject(erro.message)
      })
    })
  }
  PostSetor(setor): Promise<any> {
    return new Promise(resolve => {
      this.Http.post(`${this.rota_service}setor`, setor, { headers: this.headers }).subscribe((ret: any) => {
        resolve(ret)
      }, erro => {
        reject(erro.message)
      })
    })
  }
  GetAll(lista): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.rota_service}${lista}`, { headers: this.headers }).subscribe((retorno: any) => {
        console.log(retorno)
        resolve(retorno.contents)
      }, erro => {
        reject(erro.message)
      })
    })
  }
}
