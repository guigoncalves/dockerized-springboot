package com.example.gsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DockerizedSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerizedSpringApplication.class, args);
	}
}
