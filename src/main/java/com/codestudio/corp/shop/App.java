package com.codestudio.corp.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan("com.codestudio.corp.model")
@RestController
public class App 
{
    public static void main(String[] args) {
    	SpringApplication.run(App.class, args);
    }
    
    @GetMapping("/")
    public String hello() {
    	return "Welcome to Spring Boot App";
    }
}
