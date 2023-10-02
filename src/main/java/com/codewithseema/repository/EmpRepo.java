package com.codewithseema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithseema.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
