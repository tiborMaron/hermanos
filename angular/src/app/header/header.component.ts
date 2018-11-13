import { Component, OnInit } from '@angular/core';
import {CategoryService} from "../../service/category.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isHide: boolean = false;

  isCategoriesShown: boolean = false;

  categories: String[];

  constructor(private categoryService: CategoryService) { }

  getCategories(): void {
    this.categoryService.getCategories()
      .subscribe(categories => this.categories = categories)
  }

  hideCategories(): void {
    if(this.isCategoriesShown){
      document.getElementById("categories").style.transform = "scaleY(0)";
      document.getElementById("openCategoriesArrow").style.transform = "rotate(-90deg)";
      this.isCategoriesShown = false;
    }
  }

  showCategories(): void {
    if(!this.isCategoriesShown){
      document.getElementById("categories").style.transform = "scaleY(1)";
      document.getElementById("openCategoriesArrow").style.transform = "rotate(0deg)";
      this.isCategoriesShown = true;
    } else {
      document.getElementById("categories").style.transform = "scaleY(0)";
      document.getElementById("openCategoriesArrow").style.transform = "rotate(-90deg)";
      this.isCategoriesShown = false;
    }
  }

  ngOnInit() {
    this.getCategories();
    window.addEventListener('scroll', this.scroll);
  }

  ngOnDestroy() {
    window.removeEventListener('scroll', this.scroll);
  }

  scroll = (): void => {
    if (!this.isHide && scrollY > 20){
      this.hideCategories();
      this.isHide = true;
    }

    else if (this.isHide && scrollY < 20)
      this.isHide = false;
  };

  openHeader(): void {
    console.log(this.categories);
    this.isHide = false;
  }

}
