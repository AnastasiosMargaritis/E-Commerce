import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class LoginService {

  loginHeader: HttpHeaders;

  constructor(private httpClient: HttpClient) {}

  public generateToken(request){
    return this.httpClient.post<string>("http://localhost:8080/authenticate", request, {  responseType: 'text' as 'json' });
  }

  public userHeader(token){
    let tokenStr = 'Bearer ' + token;
    this.loginHeader = new HttpHeaders().set('Authorization', tokenStr);
    return this.loginHeader;
  }
}
