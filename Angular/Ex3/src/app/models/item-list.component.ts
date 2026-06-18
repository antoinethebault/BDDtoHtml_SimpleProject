import { Component, OnInit } from '@angular/core';
import { ItemService } from './item.service';
import { Item } from './item';
import { CommonModule } from '@angular/common';

@Component({ selector: 'app-item-list', 
    imports: [CommonModule],
    templateUrl: './items.html'
            })
export class ItemListComponent implements OnInit {
    items: Item[] = [];
    constructor (private svc: ItemService){}
    ngOnInit(): void {
        console.log("Init");
        this.svc.getAll().subscribe(data => {
            this.items = data;
            for (let i = 0; i < data.length; i++){
                console.log(data[i].name);
            }
        });
    }
    ngOnDestroy(): void {
        console.log("Destroyed");
    }
}