import { HttpClient } from '@angular/common/http';
import { Injectable} from '@angular/core';
import { Observable } from 'rxjs';
import { Coffe } from './coffe';
import { Coffe_o } from './coffe_o';
import { Person } from './person';

@Injectable({
  providedIn: 'root'
})
export class PedidoService {
  // Obtengo la lista
  private baseURL = "http://localhost:8080/cafeteria/cafes";
  private addURL = "http://localhost:8080/cafeteria/agrega";
  private registroURL = "http://localhost:8080/cafeteria/registro";
  private baseCliente = "http://localhost:8080/cafeteria/login";

  order: Array<Coffe_o> = [];
  constructor(private httpClient : HttpClient) { }

//obtengo los cafes del sql
  obtenerLista (): Observable<Coffe []> {
    return this.httpClient.get<Coffe []>(`${this.baseURL}`);
}
  registrarCafes(listaCafes: Array<Coffe_o>) : Observable<any>{
    return this.httpClient.post(`${this.addURL}`, listaCafes, {responseType: 'text'});
}
  registroClientes (cliente: Person) : Observable<any>{
    return this.httpClient.post(`${this.registroURL}`, cliente, {responseType: 'text'});
}
  login(logeado: Person) : Observable<any>{
    console.log(logeado);
    return this.httpClient.post(`${this.baseCliente}`, logeado, {responseType: 'text'});
}
}
