import { Component, OnInit } from '@angular/core';
import {Product} from "../product";
import {ProductService} from "../product.service";
import {AppRoutingModule} from "../app-routing.module";
import {Router} from "@angular/router";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products: Product[];

  openDetails($event, id: number, navigate = this.navigate, router = this.router): void{
    let path = $event.path;
    for (let index in path){
      if (path[index].className == "card"){
        path[index].style.transform = "scale(8)";
        path[index].style.filter = "brightness(0)";
        path[index].style.zIndex = "99999";
      }
    }

    setTimeout(function(){
      navigate(id, router);
    }, 200);

  }

  navigate(id: number, router): void {
    router.navigate(['/', 'product', id]).then(nav => {
      console.log(nav); // true if navigation is successful
    }, err => {
      console.log(err) // when there's an error
    });
  }

  getProducts(): void {
    this.productService.getProducts()
      .subscribe(products => this.products = products);
  }

  constructor(private productService: ProductService, private router: Router) { }

  ngOnInit() {
    this.getProducts()
  }

}
