import { Component, Inject, OnInit, Optional } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

export interface Coffe {
  typeCoffe: string;
  price: number;
  description: string;
}

@Component({
  selector: 'app-dialog-box',
  templateUrl: './dialog-box.component.html',
  styleUrls: ['./dialog-box.component.css']
})
export class DialogBoxComponent implements OnInit {

  action:string;
  local_data:any;

  constructor(
    public dialogRef: MatDialogRef<DialogBoxComponent>,
    @Optional() @Inject (MAT_DIALOG_DATA) public data: Coffe) { 
      //console.log = {...data};
      this.action = this.local_data.action;
    }

    doAction(){
      this.dialogRef.close({event:this.action,data:this.local_data});
    }
  
    closeDialog(){
      this.dialogRef.close({event:'Cancel'});
    }


  ngOnInit() {
  }

}
