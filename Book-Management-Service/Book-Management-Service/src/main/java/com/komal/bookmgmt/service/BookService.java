package com.komal.bookmgmt.service;

import com.komal.bookmgmt.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
        Book saveBook(Book Book);
        Optional<Book> findById(Long id);
         List<Book> findAllBooks();
}
