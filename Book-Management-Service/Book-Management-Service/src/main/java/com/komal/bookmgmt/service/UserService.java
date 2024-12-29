package com.komal.bookmgmt.service;

import com.komal.bookmgmt.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findById(Long id);

    List<User> findAllUsers();
}
