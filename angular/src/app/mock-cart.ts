import {Product} from "./product";

export class Cart{
  static instance: Cart = new Cart();

  products: Product[] = [];

  addToCart(product: Product): void{
    this.products.push(product);
  }

  constructor (){};

  static getInstance(): Cart {
    return this.instance;
  }
 }
