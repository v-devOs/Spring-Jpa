package com.example.IntroSpringDataJpa.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table( name = "clientes")
public class Customer {

  @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
  private Long id;


  @Column( name = "nomrbe")
  private String name;


  @Column( name = "contrasena")
  private String password;
  
  
}