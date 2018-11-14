import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import {Product} from "../model/product";
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {Location} from "@angular/common";
import {ActivatedRoute} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private productsURL = "http://localhost:8080/products";
  private productURL = "http://localhost:8080/product";

  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(this.productsURL);
    // return of (PRODUCTS);
  }

  getProductsByCategory(category: string): Observable<Product[]> {
    return this.http.get<Product[]>(this.productsURL, {
      params: {
        category: category
      }
    });
  }

  getProduct(id: number): Observable<Product>{
    return this.http.get<Product>(this.productURL,{ params: new HttpParams().append("id", id.toString())});
  }

  getCart(): Observable<Product[]>{
    return of (null)
  }

  addProductToCart(product: Product): void {

  }

  constructor(private http: HttpClient) {

  }
}
