import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Book } from '../models/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) { }

  public addNewBook(book: Book){
    return this.http.post('http://localhost:8080/book/new', book);
  }
}
