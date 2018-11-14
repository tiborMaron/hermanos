import { Component, OnInit } from '@angular/core';
import {User} from "../../../model/user";
import {CredentialsService} from "../../../service/credentials.service";
import {promise} from "selenium-webdriver";
import Promise = promise.Promise;
import {style} from "@angular/animations";
import {forEach} from "@angular/router/src/utils/collection";
import {Location} from "@angular/common";

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['../authorization.component.css']
})
export class RegistrationComponent implements OnInit {
  user: User = new User();

  constructor(
    private credentialsService: CredentialsService,
    private _location: Location
  ) { }

  register(): void {
    console.log(this.credentialsService.register(this.user).subscribe());
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
