import { HttpClient } from '@angular/common/http';
import { Injectable} from '@angular/core';
import { Observable } from 'rxjs';
import { Coffe } from './coffe';
import { Coffe_o } from './coffe_o';

@Injectable({
  providedIn: 'root'
})
export class PedidoService {
  // Obtengo la lista
  private baseURL = "http://localhost:8080/cafeteria/cafes";
  private addURL = "http://localhost:8080/cafeteria/agrega";

  order: Array<Coffe_o> = [];
  constructor(private httpClient : HttpClient) { }

//obtengo los cafes del sql
  obtenerLista (): Observable<Coffe []> {
    return this.httpClient.get<Coffe []>(`${this.baseURL}`);
}
  registrarCafes(listaCafes: Array<Coffe_o>) : Observable<any>{
    console.log (listaCafes)
    return this.httpClient.post(`${this.addURL}`, listaCafes);
  }
}
