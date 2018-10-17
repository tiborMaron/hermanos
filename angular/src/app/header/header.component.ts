import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isHide: boolean = false;

  constructor() { }

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
