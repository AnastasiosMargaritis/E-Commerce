package com.ecommerce.service;

import com.ecommerce.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findOne(Book book);

    List<Book> blurrySearch(String title);

    Book save(Book book);

    void delete(Long id);
}
