import { Component } from "@angular/core";
import { HttpClient } from '@angular/common/http';

@Component({
    selector:'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})

export class HomeComponent {
    news: any;
    constructor(private http: HttpClient) {
        this.getNews();
     }
     getNews(){
        this.http.get<any> ('https://newsapi.org/v2/top-headlines?country=us&apiKey=4b8875afb7704fc8a2723561c3e78b80').subscribe(data =>{
this.news = data.articles;

     }, err => {
         console.log(err);
     }, () => {
         console.log('news got successfully');
     
     })

     }
}