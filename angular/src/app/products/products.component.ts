import { Component, OnInit } from '@angular/core';
import {Product} from "../product";
import {ProductService} from "../product.service";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products: Product[];

  getProducts(): void {
    this.productService.getProducts()
      .subscribe(heroes => this.products = heroes);
  }

  constructor(private productService: ProductService) { }

  ngOnInit() {
    this.getProducts()
  }

}
