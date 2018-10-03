import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import {Product} from "./product";
import {PRODUCTS} from "./mock-products";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  getProducts(): Observable<Product[]> {
    return of(PRODUCTS);
  }

  constructor() { }
}
