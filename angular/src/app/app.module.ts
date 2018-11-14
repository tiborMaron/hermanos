import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule }    from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { HeaderComponent } from './header/header.component';
import { RegistrationComponent } from './authorization/registration/registration.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './authorization/login/login.component';
import { AllergenComponent } from './product-detail/allergen/allergen.component';
import { RelatedProductsComponent } from './product-detail/related-products/related-products.component';
import { RelatedProductComponent } from './product-detail/related-products/related-product/related-product.component';
import { SignupNowComponent } from './signup-now/signup-now.component';
import { FooterComponent } from './footer/footer.component';
import { AuthorizationComponent } from './authorization/authorization.component';
import { InputFieldAnimationDirective } from './authorization/input-field-animation.directive';

@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    ProductDetailComponent,
    HeaderComponent,
    RegistrationComponent,
    LoginComponent,
    AllergenComponent,
    RelatedProductsComponent,
    RelatedProductComponent,
    SignupNowComponent,
    FooterComponent,
    AuthorizationComponent,
    InputFieldAnimationDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
