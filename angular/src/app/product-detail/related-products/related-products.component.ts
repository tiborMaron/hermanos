import {Component, DoCheck, Input, OnInit} from '@angular/core';
import {Product} from "../../../model/product";
import {ProductService} from "../../../service/product.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-related-products',
  templateUrl: './related-products.component.html',
  styleUrls: ['./related-products.component.css']
})
export class RelatedProductsComponent implements OnInit {

  @Input() relatedProductsIndexes: number[];
  relatedProducts: Product[] = [];


  getProducts(): void {
    for (let i in this.relatedProductsIndexes){
      this.productService.getProduct(this.relatedProductsIndexes[i])
        .subscribe(product => this.relatedProducts.push(product));
    }
  }

  constructor(private productService: ProductService,
              private router: Router) { }


  ngOnInit() {
    this.getProducts()
  }

  openDetails($event, id: number, navigate = this.navigate, router = this.router): void{
    let path = $event.path;
    let elementIndex;
    for (let index in path){
      if (path[index].className == "related-product"){
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


}
