import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';

// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { Router, RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { ContactComponent } from './contact/contact.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DiectiveComponent } from './diective/diective.component';
import { NgIfComponent } from './diective/ng-if/ng-if.component';
import { NgForComponent } from './diective/ng-for/ng-for.component';
import { NgSwitchComponent } from './diective/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { FormComponent } from './form/form.component';
import { Form1Component } from './form/form1/form1.component';
import { Form2Component } from './form/form2/form2.component';
import { Form3Component } from './form/form3/form3.component';
import { Form4Component } from './form/form4/form4.component';
import { RegisterPageComponent } from './register-page/register-page.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentdetailsComponent } from './commentdetails/commentdetails.component';
import { CommentComponent } from './comment/comment.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AboutComponent,
    HelpComponent,
    ContactComponent,
    HomeComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DiectiveComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    FormComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    RegisterPageComponent,
    ParentComponent,
    ChildComponent,
    CommentdetailsComponent,
    CommentComponent,
    DollarPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'home', component : HomeComponent},
      {path: 'help', component : HelpComponent},
      {path: 'About', component : AboutComponent},
      {path: 'property-binding', component : PropertyBindingComponent},
      {path: 'contact', component : ContactComponent},
      {path: 'event-binding', component : EventBindingComponent},
      {path: 'two-way-binding', component : TwoWayBindingComponent},
      {path: 'ng-if', component : NgIfComponent},
      {path: 'ng-for', component : NgForComponent},
      {path: 'ng-switch', component : NgSwitchComponent},
      {path: 'register', component : RegisterComponent},
      {path: 'Login', component :  FormComponent},
      {path: 'reactive-form', component :  RegisterPageComponent},
      {path: 'parent', component :  ParentComponent},
      {path: 'commentdetails', component :  CommentdetailsComponent},

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
