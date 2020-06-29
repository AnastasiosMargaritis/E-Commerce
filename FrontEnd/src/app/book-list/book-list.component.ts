import { Component, OnInit } from '@angular/core';
import { BookService } from '../services/book.service';
import { Book } from '../models/book';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Book[];

  constructor(private service: BookService) { }

  ngOnInit() {
    this.service.getAllBooks().subscribe(
      data => {
        this.books = data;
        console.log(this.books);
      }, error => {
        console.log(error.message);
      }
    )
  }
}
