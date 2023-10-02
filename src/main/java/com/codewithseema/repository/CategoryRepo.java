package com.codewithseema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithseema.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
