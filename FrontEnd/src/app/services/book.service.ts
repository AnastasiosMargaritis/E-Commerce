import { Injectable, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Book } from '../models/book';
import { LoginService } from './login.service';

@Injectable({
  providedIn: 'root'
})
export class BookService implements OnInit{

  header: HttpHeaders;

  constructor(private http: HttpClient,
              private service: LoginService) { }

  ngOnInit(){

  }

  public addNewBook(book: Book){
    return this.http.post('http://localhost:8080/book/new', book);
  }

  public getAllBooks(){
    return this.http.get<Book[]>('http://localhost:8080/book/all');
  }
}
