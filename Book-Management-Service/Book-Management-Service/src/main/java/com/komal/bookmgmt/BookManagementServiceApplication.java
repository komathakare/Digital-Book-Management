package com.komal.bookmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.komal.bookmgmt")
public class BookManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookManagementServiceApplication.class, args);
	}

}
