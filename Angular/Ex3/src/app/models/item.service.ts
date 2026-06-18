import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Item } from "./item";

@Injectable({ providedIn:'root'})
export class ItemService {
    private baseUrl = 'http://localhost:8080/api/items';
    constructor (private http:HttpClient){}
    getAll(): Observable<Item[]>{
        return this.http.get<Item[]>(this.baseUrl);
    }
}
