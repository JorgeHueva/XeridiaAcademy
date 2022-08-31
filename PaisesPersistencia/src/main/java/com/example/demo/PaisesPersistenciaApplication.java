package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.demo")
@SpringBootApplication
public class PaisesPersistenciaApplication{

	public static void main(String[] args) {
		SpringApplication.run(PaisesPersistenciaApplication.class, args);
	}

}
