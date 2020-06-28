import { Component, OnInit } from '@angular/core';
import { Book } from '../models/book';
import {NgForm} from '@angular/forms';


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


  constructor() { }

  ngOnInit() {
  }

  public onSubmit(form: NgForm){
    console.log(form.value);
  }

}
