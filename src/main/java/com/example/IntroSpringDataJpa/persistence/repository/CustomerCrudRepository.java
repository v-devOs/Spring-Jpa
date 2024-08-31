package com.example.IntroSpringDataJpa.persistence.repository;

import org.springframework.data.repository.Repository;

import com.example.IntroSpringDataJpa.persistence.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerCrudRepository extends Repository<Customer, Long>{
  
  List<Customer> findAll();

  Optional<Customer> findById(Long id);

  Customer save(Customer customer);

  void deleteById(Long id);
}
