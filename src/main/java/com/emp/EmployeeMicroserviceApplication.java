package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmployeeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMicroserviceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplete() {
		return new RestTemplate();
	}
}
