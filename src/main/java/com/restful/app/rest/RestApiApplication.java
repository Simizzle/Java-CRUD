package com.restful.app.rest;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Bean
	public GroupedOpenApi swaggerConfiguration() {
		return GroupedOpenApi.builder()
				.group("crudAPI")
				.pathsToMatch("/users/**")
				.build();
	}

	@Bean
	public OpenAPI bookManagerInfoApi() {
		return new OpenAPI()
				.info(new Info().title("Simple CRUD application")
						.description("Need to Create, Read, Update and Delete? This is the API for you! \uD83D\uDE3A")
						.version("v1")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
