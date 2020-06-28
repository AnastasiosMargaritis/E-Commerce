package com.ecommerce.service.impl;

import com.ecommerce.domain.Book;
import com.ecommerce.repository.BookRepository;
import com.ecommerce.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        List<Book> bookList = this.bookRepository.findAll();
        List<Book> active = new ArrayList<>();

        for(Book book: bookList){
            if (book.isActive()){
                active.add(book);
            }
        }

        return active;
    }

    @Override
    public Optional<Book> findOne(Book book) {
        return this.bookRepository.findById(book.getId());
    }

    @Override
    public List<Book> blurrySearch(String title) {
        List<Book> bookList = this.bookRepository.findByTitleContaining(title);

        List<Book> active = new ArrayList<>();

        for(Book book: bookList){
            if(book.isActive()){
                active.add(book);
            }
        }

        return active;
    }

    @Override
    public Book save(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        this.bookRepository.deleteById(id);
    }
}
