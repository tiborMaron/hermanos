import { Component, OnInit } from '@angular/core';
import {Product} from "../product";
import {ProductService} from "../product.service";
import {AppRoutingModule} from "../app-routing.module";
import {ActivatedRoute, Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {Location} from "@angular/common";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products: Product[];

  openDetails($event, id: number, navigate = this.navigate, router = this.router): void{
    let path = $event.path;
    let elementIndex;
    for (let index in path){
      if (path[index].className == "card"){
        path[index].style.transform = "scale(8)";
        path[index].style.filter = "brightness(0)";
        path[index].style.zIndex = "99999";
      }
    }

    setTimeout(function(){
      navigate(id, router);
    }, 190);

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

  getProductsByCategory(category: string): void {
    this.productService.getProductsByCategory(category)
      .subscribe(products => this.products = products);
  }

  constructor(private productService: ProductService, private router: Router,
              private http: HttpClient,
              private route: ActivatedRoute,
              private location: Location) { }

  ngOnInit() {
    this.route.queryParams.subscribe(param => this.getProductsByCategory(param["category"]));
    // console.log(this.route.queryParams["category"])
    // if (this.route.queryParams)
    // this.getProducts()
  }

}
