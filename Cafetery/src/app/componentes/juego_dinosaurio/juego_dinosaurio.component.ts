import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-juego_dinosaurio',
  templateUrl: './juego_dinosaurio.component.html',
  styleUrls: ['./juego_dinosaurio.component.css']
})
export class Juego_dinosaurioComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    let body =  document.body;
    let script = document.createElement('script');
    script.type = "text/javascript";
    script.src = 'src\app\componentes\juego_dinosaurio\scrip.js';
    body.appendChild(script);
  }


}
