package com.codewithseema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithseema.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
