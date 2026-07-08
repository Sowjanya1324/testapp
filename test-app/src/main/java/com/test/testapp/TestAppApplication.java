package com.test.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TestAppApplication {
	
	@GetMapping
	public String getMsg() {
		return "Hello World!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestAppApplication.class, args);
		
	}

}
