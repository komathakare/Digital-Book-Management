package com.komal.bookmgmt.controller;

import com.komal.bookmgmt.entity.Book;
import com.komal.bookmgmt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

 /*   @GetMapping("/test")
    public String testing(){
        return  "Hello this is testing string..1!";
    }

    @GetMapping("/test2")
    public String testing2(){
        return  "Hello this is testing string..2!";
    }*/

    //save Book
    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
        System.out.println("Book Details : " + book);
        Book response = bookService.saveBook(book);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Book>> findAllBooks() {
        List<Book> listResponse = bookService.findAllBooks();
        return new ResponseEntity<>(listResponse, HttpStatus.OK);
    }

    @GetMapping("{bookId}")
    public ResponseEntity<?> findById(@PathVariable Long bookId){
        Optional<Book> responseBook = bookService.findById(bookId);
        if (responseBook.isPresent()){
            return new ResponseEntity<>(responseBook.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>("No Book Record Found..!",HttpStatus.NOT_FOUND );
    }
}



