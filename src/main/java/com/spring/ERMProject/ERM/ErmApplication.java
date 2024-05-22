package com.spring.ERMProject.ERM;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan(basePackages = {"com.spring.ERMProject.ERM.entity"})
public class ErmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErmApplication.class, args);
	}
	@Bean
	CommandLineRunner init(EntityManagerFactory entityManagerFactory) {
		return args -> {
			entityManagerFactory.getCache().evictAll();
		};
	}

}
