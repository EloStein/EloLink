package de.spring.elolink_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElolinkSpringApplication {

	//CLIENT

	public void client(){
		System.out.println("Official EloLink Client");
	}

	public static void main(String[] args) {
		SpringApplication.run(ElolinkSpringApplication.class, args);
	}

}
