package com.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SwaggerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerTestApplication.class, args);
	}
	
	@GetMapping(value = "/test")
    public String custom() {
        return "test";
    }

}
