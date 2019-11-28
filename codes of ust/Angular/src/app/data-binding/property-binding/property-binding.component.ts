import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
name: string = 'pawan';
address = 'vijaynagara,mheshwaralya-560023';
color: string = 'red';
colspanValue: number = 2;
imgUrl: string ="https://cdn.pixabay.com/photo/2019/09/26/15/46/girl-4506318__340.jpg";
  isActive: boolean;
  constructor() {}
  ngOnInit() {
    setInterval(() => {
      
      this.color = 'red';
      this.isActive = !this.isActive;
    }, 2000);
  }

}
