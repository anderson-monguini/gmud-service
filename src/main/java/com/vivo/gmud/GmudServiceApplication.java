package com.vivo.gmud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.vivo.gmud.controller.SwaggerConfig;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@Import(SwaggerConfig.class)
@ComponentScan("com")
public class GmudServiceApplication extends SpringBootServletInitializer {
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(GmudServiceApplication.class);
	    }
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(GmudServiceApplication.class, args);
	}
}
