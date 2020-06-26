import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';


export class validate{
  constructor(private token: string,
              private username: string,
              private password: string)
              {}
}


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  loginHeader: HttpHeaders;
  isLoggedIn = false;
  username: string;
  password: string;
  token : string;
  validate: validate;

  constructor(private httpClient: HttpClient) {}

  public generateToken(request){
    this.username = request.username;
    this.password = request.password;
    return this.httpClient.post<string>("http://localhost:8080/authenticate", request, {  responseType: 'text' as 'json' });
  }

  public userHeader(token){
    this.token = token;
    let tokenStr = 'Bearer ' + token;
    this.loginHeader = new HttpHeaders().set('Authorization', tokenStr);
    return this.loginHeader;
  }

  public logout(){
    sessionStorage.removeItem('token');
  }


}
