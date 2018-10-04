import { Component, OnInit } from '@angular/core';
import {ProductService} from "../product.service";
import {Product} from "../product";

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  productsInCart: Product[];

  getProductsInCart(): void {
    this.productService.getCart()
      .subscribe(productsInCart => this.productsInCart = productsInCart);
  }

  constructor(private productService: ProductService) { }

  ngOnInit() {
    this.getProductsInCart()
  }

}
