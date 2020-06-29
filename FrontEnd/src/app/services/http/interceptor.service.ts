import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler } from '@angular/common/http';
import { LoginService } from '../login.service';

@Injectable({
  providedIn: 'root'
})
export class InterceptorService implements HttpInterceptor{

  constructor(private auth: LoginService){ }

  intercept(request: HttpRequest<any>, next: HttpHandler){

    let header = this.auth.getAuthenticatedToken();
    let username = this.auth.getAuthenticatedUser();

    if(header && username){
      request = request.clone({
        setHeaders: {
          Authorization : header
        }
      })
    }

    console.log(header);
    return next.handle(request);
  }
}
