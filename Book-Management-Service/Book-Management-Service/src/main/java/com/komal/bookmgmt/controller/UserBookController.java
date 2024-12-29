package com.komal.bookmgmt.controller;

import com.komal.bookmgmt.dto.UserBook;
import com.komal.bookmgmt.service.UserBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userbook")
public class UserBookController {
    @Autowired
    UserBookService userBookService;

    @GetMapping("/{id}")
    public UserBook getUserBookDetails(@PathVariable Long id) {
        UserBook userBook = userBookService.findUserBookDetailsById(id);
        return userBook;
    }
}
