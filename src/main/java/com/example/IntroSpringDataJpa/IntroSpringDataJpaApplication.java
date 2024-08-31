package com.example.IntroSpringDataJpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.IntroSpringDataJpa.persistence.entity.Customer;
import com.example.IntroSpringDataJpa.persistence.repository.CustomerCrudRepository;

import java.util.List;

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

//			Customer ramon = new Customer();
//			ramon.setName("ramon Lopez");
//			ramon.setPassword("ramon123");
//
//			Customer luis = new Customer();
//			luis.setName("luis marquez");
//			luis.setPassword("luis123");

//			System.out.println("Se guardaron 3 entidades");
//			List<Customer> clientes = List.of(juan, ramon, luis);
//
//			customerCrudRepository.saveAll(clientes);
//
//			System.out.println("Se guardo la entidad juan");
//
//			System.out.println("\n Imprimiendo todos los clientes");
//			customerCrudRepository.findAll()
//				.forEach(System.out::println);

			System.out.println("\nBuscando al cliente juan");
			customerCrudRepository.findById(2L).ifPresent( cliente -> {
				cliente.setName("Uriel");

				customerCrudRepository.save( cliente );
			});




			System.out.println("\nEliminando al cliente juan");
			customerCrudRepository.deleteById(1L);

			System.out.println("\nBuscando al cliente juan");
			customerCrudRepository.findById(1L)
			.ifPresent(System.out::println);

		};
	}
}
 