import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LoginService } from '../services/login.service';
import { HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';

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


  constructor(private service: LoginService,
              private route: Router) { }

  ngOnInit() {
  }

  public getAccessToken(authRequest){
    this.service.generateToken(authRequest).subscribe(
      data => {
        this.isError = false;
        this.route.navigate(['admin']);
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

    this.getAccessToken(authRequest);
  }

}
