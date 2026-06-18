import { Component, NgModule, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {HttpClient, HttpClientModule, HttpHandler} from '@angular/common/http';
import { ItemListComponent } from './models/item-list.component';
import { Div } from './div/div'
import { ItemService } from './models/item.service';

@Component({
  selector: 'app-root',
  imports: [ItemListComponent, Div, RouterOutlet, HttpClientModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  constructor (private http:HttpClient){}
  ngOnInit(): void {
    const srv = new ItemService(this.http);
    const ilc = new ItemListComponent(srv);

  }
  protected readonly title = signal('Ex3');
}
