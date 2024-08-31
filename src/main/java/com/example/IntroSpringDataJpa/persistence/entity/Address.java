package com.example.IntroSpringDataJpa.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Address
 */
@Getter
@Setter
@Entity
@Table( name = "direcciones")
public class Address {

  @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
  private Long id;


  @Column( name = "pais")
  private String country;


  @Column( name = "direccion")
  private String address;
  

}