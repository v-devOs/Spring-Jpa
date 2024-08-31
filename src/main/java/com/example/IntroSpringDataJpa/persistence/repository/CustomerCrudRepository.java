package com.example.IntroSpringDataJpa.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.IntroSpringDataJpa.persistence.entity.Customer;

public interface CustomerCrudRepository extends CrudRepository<Customer, Long>{
  
 
}
