import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
cars = [
  {
imgUrl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
name: 'bmw',
},
{
  imgUrl : 'https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930__340.jpg',
  name: 'ferari',
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
    name: 'audi',
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/23/17/25/beach-1853939__340.jpg',
      name: 'lemborgini',
      }
]
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }
}
