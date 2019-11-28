import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-if',
  templateUrl: './ng-if.component.html',
  styleUrls: ['./ng-if.component.css']
})
export class NgIfComponent implements OnInit {
 
showOrHide:boolean=true;
  constructor() { 
    setTimeout(()=>{
      this.showOrHide=false;
    },2000)
  }
// tslint:disable-next-line: whitespace



  ngOnInit() {
  }

}
