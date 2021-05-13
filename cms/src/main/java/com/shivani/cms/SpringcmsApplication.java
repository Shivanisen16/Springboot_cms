package com.shivani.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.shivani")
@SpringBootApplication
public class SpringcmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcmsApplication.class, args);
	}

}
