import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LoginService } from '../services/login.service';
import { HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: string;
  password: string;
  isError = false;
  errorMessage: string;
  header: HttpHeaders;

  constructor(private service: LoginService) { }

  ngOnInit() {
  }

  public getAccessToken(authRequest){
    this.service.generateToken(authRequest).subscribe(
      data => {
        sessionStorage.setItem('token', `Bearer ${data}`);
      }, error => {
        this.isError = true;
        this.errorMessage = error.message;
      }
    )
  }

  onSubmit(form: NgForm){

    const value = form.value;

    this.username = value.username;
    this.password = value.password;

    let authRequest = {
      "username" : this.username,
      "password" : this.password
    };

    console.log(authRequest);

    this.getAccessToken(authRequest);

  }

}
