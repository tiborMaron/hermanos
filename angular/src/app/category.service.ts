import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "./user";
import {Observable} from "rxjs/index";
import {Category} from "./category";

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  private categoryURL = "http://localhost:8080/category";

  getCategories(): Observable<String[]> {
    return this.http.get<String[]>(this.categoryURL);
  }

  constructor(private http: HttpClient) { }
}
