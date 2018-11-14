import {Component, Input, OnInit} from '@angular/core';
import {Product} from "../../../../model/product";

@Component({
  selector: 'app-related-product',
  templateUrl: './related-product.component.html',
  styleUrls: ['./related-product.component.css']
})
export class RelatedProductComponent implements OnInit {
  @Input() product: Product;

  constructor() { }

  ngOnInit() {
  }

}
