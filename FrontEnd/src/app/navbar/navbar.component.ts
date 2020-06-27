import { Component, OnInit, OnChanges } from '@angular/core';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{

  constructor(private service: LoginService) { }

  loggedIn: boolean = false;

  ngOnInit() {

  }

  toggleDisplay(){
    this.loggedIn = !this.loggedIn;
  }

  public onLogout(){
    this.service.logout();
  }

}
