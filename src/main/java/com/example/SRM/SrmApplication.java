package com.example.SRM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SrmApplication {
	private static final String DB_USERNAME = "postgres";
	private static final String DB_PASSWORD = "1234";
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/SRM DB";
	public static void main(String[] args) {
		SpringApplication.run(SrmApplication.class, args);
	}

}
