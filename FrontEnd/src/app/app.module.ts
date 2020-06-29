import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSliderModule, MatListModule, MatGridListModule,
  MatButtonModule,
  MatFormFieldModule,
  MatInputModule } from '@angular/material';
import { LoginService } from './services/login.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AdminComponent } from './admin/admin.component';
import { AddBookComponent } from './add-book/add-book.component';
import { BookListComponent } from './book-list/book-list.component';
import { InterceptorService } from './services/http/interceptor.service';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    AdminComponent,
    AddBookComponent,
    BookListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatSliderModule,
    MatListModule,
    MatGridListModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule, FormsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [LoginService,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: InterceptorService,
      multi: true
    }],
  bootstrap: [AppComponent]
})
export class AppModule { }
