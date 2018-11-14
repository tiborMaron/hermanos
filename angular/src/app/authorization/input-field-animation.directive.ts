import {Directive, ElementRef, HostListener, OnInit, Renderer2} from '@angular/core';
import {Listener} from "selenium-webdriver";

@Directive({
  selector: '[appInputFieldAnimation]'
})
export class InputFieldAnimationDirective implements OnInit {
  private label: HTMLLabelElement;
  private input: HTMLInputElement;

  constructor(
    private elementRef: ElementRef,
    private renderer: Renderer2
  ) {}

  ngOnInit() {
    this.input = this.elementRef.nativeElement.childNodes[1];
    this.label = this.elementRef.nativeElement;
    this.renderer.listen(this.label, "click", () => this.onClick());
    this.renderer.listen(this.input, "blur", () => this.onBlur());
  }

  onClick() {
    this.renderer.setStyle(this.label, "padding-right", "70%");
    this.renderer.setStyle(this.input, "width", "70%");
    this.input.focus();
  }

  onBlur() {
    if (!this.input.value){
      this.renderer.setStyle(this.label, "padding-right", "0");
      this.renderer.setStyle(this.input, "width", "0");
    }
  }

}
