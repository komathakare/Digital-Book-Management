package com.komal.bookmgmt.service;

import com.komal.bookmgmt.entity.Book;
import com.komal.bookmgmt.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    public BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        Book response = bookRepository.save(book);
        return response;
    }

    @Override
    public Optional<Book> findById(Long id) {
         Optional<Book> book = bookRepository.findById(id);
         return book;
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
