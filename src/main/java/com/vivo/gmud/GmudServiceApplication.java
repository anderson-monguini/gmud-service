package com.vivo.gmud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class GmudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmudServiceApplication.class, args);
	}
}
