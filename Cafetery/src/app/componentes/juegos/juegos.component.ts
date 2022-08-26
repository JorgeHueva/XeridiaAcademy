import { Component, OnInit } from '@angular/core';
import { GameService } from '../../servicios/game.service';

@Component({
  selector: 'app-juegos',
  templateUrl: './juegos.component.html',
  styleUrls: ['./juegos.component.css']
})
export class JuegosComponent implements OnInit {

  result: string = "";
  pointsUser = 0;
  pointsComp =  0;


  constructor(private playGame: GameService) { }

  ngOnInit() {
    this.result = 'Esperando jugada...';
  }


  play(choice: string): void {
    const result = this.playGame.game(choice);
    this.result = result.message;
    this.pointsUser += result.userAdd;
    this.pointsComp += result.compAdd;
  }

}
