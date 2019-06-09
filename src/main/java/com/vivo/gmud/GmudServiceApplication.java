package com.vivo.gmud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.vivo.gmud.controller.SwaggerConfig;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2
@Import(SwaggerConfig.class)
@ComponentScan("com")
@SpringBootApplication
public class GmudServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GmudServiceApplication.class, args);
	}
}