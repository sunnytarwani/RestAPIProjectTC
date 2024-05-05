package com.suunny.RestAPIProjectTC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.yaml")
public class RestApiProjectTcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiProjectTcApplication.class, args);
	}

}
