import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

import { ProductService }  from '../product.service';
import {Product} from "../product";

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
  product: Product;

  getProduct(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.productService.getProduct(id)
      .subscribe(product => this.product = product);
  }

  constructor(
    private route: ActivatedRoute,
    private productService: ProductService,
    private location: Location
  ) {}

  ngOnInit() {
    this.getProduct();
    setTimeout(function(){
      document.getElementById("animate").style.opacity = "0";
    }, 100);

    setTimeout(function(){
      document.getElementById("animate").style.display = "none";
    }, 200);

  }

  addToCart(product: Product): void {
    this.productService.addProductToCart(product);
  }

}
