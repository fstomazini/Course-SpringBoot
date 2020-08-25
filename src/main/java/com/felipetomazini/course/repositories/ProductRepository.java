package com.felipetomazini.course.repositories;

import com.felipetomazini.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
