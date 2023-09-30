package com.codeartisans.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.codeartisans.controller") // Because it is in a different package.
public class RestapiSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestapiSpringbootApplication.class, args);
    }
}
