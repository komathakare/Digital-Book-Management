package com.komal.bookmgmt.repository;

import com.komal.bookmgmt.dto.UserBook;
import com.komal.bookmgmt.entity.User;
import jakarta.servlet.http.PushBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
