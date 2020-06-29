import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  loginHeader: HttpHeaders;
  isLoggedIn = false;


  constructor(private httpClient: HttpClient,
              private router: Router) {}

  public generateToken(request){
    return this.httpClient.post<string>("http://localhost:8080/authenticate", request, {  responseType: 'text' as 'json' });
  }

  public userHeader(token){
    let tokenStr = 'Bearer ' + token;
    this.loginHeader = new HttpHeaders().set('Authorization', tokenStr);
    return this.loginHeader;
  }

  getAuthenticatedUser(){
    return sessionStorage.getItem('authenticatedUser');
  }

  getAuthenticatedToken(){
    if(this.getAuthenticatedUser()){
      return sessionStorage.getItem('Authorization');
    }
  }

  public _isLoggedIn(){
    let user = sessionStorage.getItem('Authorization');
    return !(user == null);
  }

  public logout(){
    sessionStorage.removeItem('Authorization');
    sessionStorage.removeItem('authenticatedUser');
    this.router.navigate(['login'])
  }


}
