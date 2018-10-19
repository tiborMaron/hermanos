import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {User} from "./user";
import {Credentials} from "./credentials";

@Injectable({
  providedIn: 'root'
})
export class CredentialsService {
  private registrationURL = "http://localhost:8080/registration";
  private loginURL = "http://localhost:8080/login";

  register(user: User): Observable<String> {
    return this.http.post<String>(this.registrationURL, user);
  }

  login(credentials: Credentials): Observable<String> {
    return this.http.post<String>(this.loginURL, credentials);
  }

  constructor(private http: HttpClient) { }
}
