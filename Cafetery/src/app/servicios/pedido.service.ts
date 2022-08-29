import { HttpClient } from '@angular/common/http';
import { Injectable} from '@angular/core';
import { Observable } from 'rxjs';
import { Food } from '../interfaces/food';
import { Coffe } from '../interfaces/coffe';
import { Coffe_o } from '../interfaces/coffe_o';
import { Fav } from '../interfaces/Fav';
import { Person } from '../interfaces/person';

@Injectable({
  providedIn: 'root'
})
export class PedidoService {
  // Obtengo la lista
  private baseURL = "http://localhost:8080/cafeteria/cafes";
  private addURL = "http://localhost:8080/cafeteria/agrega";
  private registroURL = "http://localhost:8080/cafeteria/registro";
  private baseCliente = "http://localhost:8080/cafeteria/login";
  private baseFav = "http://localhost:8080/cafeteria/favoritos";
  private baseObtenerFav = "http://localhost:8080/cafeteria/fav";
  private baseFood = "http://localhost:8080/cafeteria/comida";

  order: Array<Coffe_o> = [];

  favoritos: Array <Fav> =[];

  logeado: Person = {};

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
    return this.httpClient.post(`${this.baseCliente}`, logeado);
}

  fav(fav: Fav): Observable<any> {
    console.log(fav);
    return this.httpClient.post(`${this.baseFav}`, fav);
  }

  obtenerfav (email: String | undefined): Observable<any> {
    return this.httpClient.post(`${this.baseObtenerFav}`, email);
}

obtenerFood (): Observable<Food []> {
  return this.httpClient.get<Food []>(`${this.baseFood}`);
}



}
