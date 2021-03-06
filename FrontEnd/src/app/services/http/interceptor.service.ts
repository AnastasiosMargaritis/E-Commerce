import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent } from '@angular/common/http';
import { LoginService } from '../login.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InterceptorService implements HttpInterceptor{

  constructor(private auth: LoginService){ }

  intercept(request: HttpRequest<any>, next: HttpHandler):Observable<HttpEvent<any>>{

    let header = this.auth.getAuthenticatedToken();
    let username = this.auth.getAuthenticatedUser();

    if(header && username){
      request = request.clone({
        setHeaders: {
          Authorization : header
        }
      })
    }
    return next.handle(request);
  }
}
