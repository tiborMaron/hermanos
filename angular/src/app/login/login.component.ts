import { Component, OnInit } from '@angular/core';
import {CredentialsService} from "../credentials.service";
import {User} from "../user";
import {Credentials} from "../credentials";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  credentials: Credentials = new Credentials();

  login(): void {
    console.log(this.credentialsService.login(this.credentials["email"], this.credentials["password"]).subscribe());
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

  constructor(private credentialsService: CredentialsService) { }

  ngOnInit() {
    document.getElementById("content").style.overflow = "hidden";
  }

  ngOnDestroy() {
    document.getElementById("content").style.overflow = "unset";
  }

}
