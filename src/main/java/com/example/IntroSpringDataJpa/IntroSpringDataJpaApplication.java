package com.example.IntroSpringDataJpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.IntroSpringDataJpa.persistence.entity.Customer;
import com.example.IntroSpringDataJpa.persistence.repository.CustomerCrudRepository;

@SpringBootApplication
public class IntroSpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringDataJpaApplication.class, args);
	}

	@Autowired
	private CustomerCrudRepository customerCrudRepository;

	@Bean
	CommandLineRunner testCustomerRepositoryCommand(){
		return args -> {
			Customer juan = new Customer();
			juan.setName("Juan Lopez");
			juan.setPassword("juan123");

			customerCrudRepository.save(juan);

			// System.out.println("Se guardo la entidad juan");

			// System.out.println("\n Imprimiendo todos los clientes");
			// customerCrudRepository.findAll()
			// 	.forEach( each -> System.out.println(each));

			System.out.println("\nBuscando al cliente juan");
			customerCrudRepository.findById(1L)
			.ifPresent(System.out::println);


			System.out.println("\nEliminando al cliente juan");
			customerCrudRepository.deleteById(1L);

			System.out.println("\nBuscando al cliente juan");
			customerCrudRepository.findById(1L)
			.ifPresent(System.out::println);

		};
	}
}
 