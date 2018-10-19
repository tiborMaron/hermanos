import { Component, OnInit } from '@angular/core';
import {User} from "../user";
import {CredentialsService} from "../credentials.service";
import {promise} from "selenium-webdriver";
import Promise = promise.Promise;
import {style} from "@angular/animations";
import {forEach} from "@angular/router/src/utils/collection";
import {Location} from "@angular/common";

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user: User = new User();

  register(): void {
    console.log(this.credentialsService.register(this.user).subscribe());
    this._location.back();
  }

  onClick($event): void {
    if ($event.target.nodeName == "LABEL"){
      $event.target.style.paddingRight = "70%";
      let node =  $event.target.childNodes[1];
      node.style.width = "70%";
      node.focus();
    }
  }

  cancel() {
    this._location.back();
  }

  onBlur($event): void {
    if(!this.user[$event.target.parentElement.id]){
      $event.target.parentElement.style.paddingRight = "0";
      $event.target.style.width = "0";
    }
  }

  constructor(private credentialsService: CredentialsService, private _location: Location) { }

  ngOnInit() {
    document.getElementById("content").style.overflow = "hidden";
  }

  ngOnDestroy() {
    document.getElementById("content").style.overflow = "unset";
  }

}
