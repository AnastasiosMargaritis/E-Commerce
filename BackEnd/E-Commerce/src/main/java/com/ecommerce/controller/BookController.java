package com.ecommerce.controller;


import com.ecommerce.domain.Book;
import com.ecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    @RequestMapping("new")
    public Book createNewBook(Book book){
        return this.bookService.createBook(book);
    }
}
