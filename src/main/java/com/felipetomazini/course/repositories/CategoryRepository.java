package com.felipetomazini.course.repositories;

import com.felipetomazini.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
