package com.felipetomazini.course.repositories;

import com.felipetomazini.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
