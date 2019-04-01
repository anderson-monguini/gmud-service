package com.vivo.gmud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.vivo.gmud.controller.SwaggerConfig;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@Import(SwaggerConfig.class)
@ComponentScan("com")
public class GmudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmudServiceApplication.class, args);
	}
}
