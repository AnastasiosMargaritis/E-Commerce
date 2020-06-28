import { Component, OnInit } from '@angular/core';
import { Book } from '../models/book';
import {NgForm} from '@angular/forms';
import { BookService } from '../services/book.service';


@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {


  bookAdded = false;
  newBook: Book;

  category = ['Fiction', 'Engineering', 'Management', 'Programming', 'Arts', 'Literature'];
  formats = ['Paperback', 'Hardcovered'];
  languages = ['English', 'Greek', 'French'];


  constructor(private service: BookService) { }

  ngOnInit() {
  }

  public onSubmit(form: NgForm){
    this.service.addNewBook(form.value).subscribe(
      data => {
        this.bookAdded = true;
      }, error =>{
        console.log(error.message);
      }
    );
  }

}
