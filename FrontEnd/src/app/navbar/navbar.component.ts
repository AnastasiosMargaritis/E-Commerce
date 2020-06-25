import { Component, OnInit, OnChanges } from '@angular/core';
import { LoginService } from '../services/login.service';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{

  constructor(private service: LoginService) { }

  loggedIn: boolean = false;

  ngOnInit() {
    this.service.checkSession();
  }

  toggleDisplay(){
    this.loggedIn = !this.loggedIn;
  }

}
