import { Component, OnInit } from '@angular/core';
import {Category} from "../category";
import {CategoryService} from "../category.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isHide: boolean = false;

  categories: Category[];

  constructor(private categoryService: CategoryService) { }

  getCategories(): void {
    this.categories = this.categoryService.getCategories()
      .subscribe(categories => this.categories = categories)
  }

  ngOnInit() {
    window.addEventListener('scroll', this.scroll);
  }

  ngOnDestroy() {
    window.removeEventListener('scroll', this.scroll);
  }

  scroll = (): void => {
    if (!this.isHide && scrollY > 20)
      this.isHide = true;
    else if (this.isHide && scrollY < 20)
      this.isHide = false;
  };

  openHeader(): void {
    this.isHide = false;
  }

}
