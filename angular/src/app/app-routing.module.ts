import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductsComponent} from "./products/products.component";
import {ProductDetailComponent} from "./product-detail/product-detail.component";
import {RegistrationComponent} from "./authorization/registration/registration.component";
import {LoginComponent} from "./authorization/login/login.component";

const routes: Routes = [
  { path: 'products', component: ProductsComponent, runGuardsAndResolvers: 'always'},
  { path: '', redirectTo: '/products', pathMatch: 'full' },
  { path: 'product/:id', component: ProductDetailComponent},
  { path: 'registration', component: RegistrationComponent, outlet: 'credentials'},
  { path: 'login', component: LoginComponent , outlet: 'credentials'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
