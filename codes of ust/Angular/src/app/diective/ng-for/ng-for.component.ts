import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
products = [{
  img: 'https://cdn.pixabay.com/photo/2015/12/30/11/57/fruit-basket-1114060__340.jpg',
  name: 'silver',
  price: 244
},
{img: 'https://cdn.pixabay.com/photo/2016/02/19/11/35/make-up-1209798__340.jpg',
name: 'gold',
price: 744
},
{
  img: 'https://cdn.pixabay.com/photo/2017/11/22/22/53/nuts-2971675__340.jpg',
  name: 'diamond',
  price: 874

},
];
  constructor() { }

  ngOnInit() {
  }

}
