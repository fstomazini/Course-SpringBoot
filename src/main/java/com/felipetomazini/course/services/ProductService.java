package com.felipetomazini.course.services;

import com.felipetomazini.course.entities.Product;
import com.felipetomazini.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll(){
        return ProductRepository.findAll();
    }
    public Product findById(long id){
        Optional<Product> obj = ProductRepository.findById(id);
        return obj.get();
    }

}
