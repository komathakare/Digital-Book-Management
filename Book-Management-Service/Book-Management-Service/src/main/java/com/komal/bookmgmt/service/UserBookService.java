package com.komal.bookmgmt.service;

import com.komal.bookmgmt.dto.UserBook;
import com.komal.bookmgmt.entity.Book;
import com.komal.bookmgmt.entity.User;
import com.komal.bookmgmt.repository.BookRepository;
import com.komal.bookmgmt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserBookService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BookRepository bookRepository;

    public UserBook findUserBookDetailsById(Long id) {
        User user = userRepository.findById(id).get();
        Book book = bookRepository.findById(user.getBookId()).get();
        UserBook userBook = new UserBook();
        userBook.setBookAuthor(book.getAuthorName());
        userBook.setBookName(book.getBookName());
        userBook.setDepartment(user.getDepartment());
        userBook.setId(user.getId());
        userBook.setIsbn(book.getIsbn());
        user.setBookId(book.getId());
        userBook.setUerName(user.getName());

        return userBook;
    }
}
