import { Component, OnInit } from '@angular/core';
import {CredentialsService} from "../../service/credentials.service";
import {User} from "../../model/user";
import {Credentials} from "../../model/credentials";
import { Location } from '@angular/common';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  credentials: Credentials = new Credentials();

  login(): void {
    console.log(this.credentialsService.login(this.credentials).subscribe());
    this._location.back();
  }

  cancel() {
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

  onBlur($event): void {
    if(!this.credentials[$event.target.parentElement.id]){
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
