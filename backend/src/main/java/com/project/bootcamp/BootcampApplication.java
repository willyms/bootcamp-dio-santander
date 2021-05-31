package com.project.bootcamp;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import org.modelmapper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return  new ModelMapper();
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("${bootcamp.name}") String appName,
								 @Value("${bootcamp.description}") String appDesciption,
								 @Value("${bootcamp.version}") String appVersion) {
		return new OpenAPI()
				.info(new Info()
								.title(appName)
								.version(appVersion)
								.description(appDesciption)
								.termsOfService("http://swagger.io/terms/")
								.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
