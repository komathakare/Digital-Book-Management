package com.komal.bookmgmt.controller;

import com.komal.bookmgmt.entity.User;
import com.komal.bookmgmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

 /*   @GetMapping("/test")
    public String testing(){
        return  "Hello this is testing string..1!";
    }

    @GetMapping("/test2")
    public String testing2(){
        return  "Hello this is testing string..2!";
    }*/

    //save User
    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        System.out.println("User Details : " + user);
        User response = userService.saveUser(user);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> listResponse = userService.findAllUsers();
        return new ResponseEntity<>(listResponse, HttpStatus.OK);
    }

    @GetMapping("{UserId}")
    public ResponseEntity<?> findById(@PathVariable Long UserId) {
        Optional<User> responseUser = userService.findById(UserId);
        if (responseUser.isPresent()) {
            return new ResponseEntity<>(responseUser.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>("No User Record Found..!", HttpStatus.NOT_FOUND);
    }
}



