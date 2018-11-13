import {Component, Input, OnInit} from '@angular/core';
import {Allergen} from '../../../model/allergen'

@Component({
  selector: 'app-allergen',
  templateUrl: './allergen.component.html',
  styleUrls: ['./allergen.component.css']
})
export class AllergenComponent implements OnInit {
  @Input() allergen: Allergen;

  constructor() { }

  ngOnInit() {
  }

}
