package com.codewithseema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithseema.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
