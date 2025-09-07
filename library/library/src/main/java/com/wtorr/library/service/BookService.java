package com.wtorr.library.service;

import com.wtorr.library.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Book createBook(Book book);
    Optional<Book> findByIsbn(int isbn);
    Book updateBook(int isbn, Book book);
    void deleteById(int isbn);
    List<Book> listBooks();

    void test2();
}
