package com.felipetomazini.course.repositories;

import com.felipetomazini.course.entities.Order;
import com.felipetomazini.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
