import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Coffe } from './coffe';

@Injectable({
  providedIn: 'root'
})
export class PedidoService {
  // Obtengo la lista
  private baseURL = "http://localhost:8080/cafeteria/cafes";

constructor(private httpClient : HttpClient) { }

//obtengo los cafes del sql
obtenerLista (): Observable<Coffe []> {
  return this.httpClient.get<Coffe []>(`${this.baseURL}`);
}
}
