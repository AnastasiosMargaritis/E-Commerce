package com.ecommerce.controller;


import com.ecommerce.domain.Book;
import com.ecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin("http://localhost:4200")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    @RequestMapping("/all")
    public List<Book> getAllBooks(){
        return this.bookService.findAll();
    }

    @PostMapping
    @RequestMapping("new")
    public Book createNewBook(@RequestBody Book book){
        return this.bookService.save(book);
    }
}
