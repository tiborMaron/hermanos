import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import {Product} from "./product";
import {PRODUCTS} from "./mock-products";
import {Cart} from "./mock-cart";
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private productsURL;

  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(this.productsURL);
  }

  getProduct(id: number): Observable<Product>{
    return of(PRODUCTS.find(product => product.id == id));
  }

  getCart(): Observable<Product[]>{
    return of (Cart.getInstance().products)
  }

  addProductToCart(product: Product): void {
    Cart.getInstance().addToCart(product);
  }

  constructor(private http: HttpClient) { }
}
