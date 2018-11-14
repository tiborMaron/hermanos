import {Component, DoCheck, OnChanges, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { Location } from '@angular/common';

import { ProductService }  from '../../service/product.service';
import {Product} from "../../model/product";
import {Allergen} from "../../model/allergen";

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
  product: Product;
  allergens: Allergen[] = [
    {name: 'celery', contains: true},
    {name: 'gluten', contains: true},
    {name: 'crustacean', contains: false},
    {name: 'egg', contains: true},
    {name: 'fish', contains: false},
    {name: 'lupin', contains: false},
    {name: 'milk', contains: false},
    {name: 'mollusc', contains: false},
    {name: 'mustard', contains: true},
    {name: 'tree_nut', contains: false},
    {name: 'peanut', contains: false},
    {name: 'sesame', contains: true},
    {name: 'soy', contains: true},
    {name: 'sulphite', contains: true},
    ];

  amount: number = 1;

  relatedProducts: number[] = [1, 10, 5];

  private lastID: number;

  getProduct(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.productService.getProduct(id)
      .subscribe(product => this.product = product);
  }

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private productService: ProductService,
    private location: Location
  ) {router.events.subscribe(() => this.getProduct())}

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

  decreaseAmount(): void {
    if (this.amount > 1)
      this.amount--;
  }

  increaseAmount(): void {
    this.amount++;
  }



}
