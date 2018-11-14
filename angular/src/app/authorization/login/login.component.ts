import { Component, OnInit } from '@angular/core';
import {CredentialsService} from "../../../service/credentials.service";
import {User} from "../../../model/user";
import {Credentials} from "../../../model/credentials";
import { Location } from '@angular/common';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['../authorization.component.css']
})
export class LoginComponent implements OnInit {
  credentials: Credentials = new Credentials();

  constructor(
    private credentialsService: CredentialsService,
    private _location: Location
  ) { }

  login(): void {
    console.log(this.credentialsService.login(this.credentials).subscribe());
    this._location.back();
  }

  cancel() {
    this._location.back();
  }

  ngOnInit() {
    document.getElementById("content").style.overflow = "hidden";
  }

  ngOnDestroy() {
    document.getElementById("content").style.overflow = "unset";
  }

}
