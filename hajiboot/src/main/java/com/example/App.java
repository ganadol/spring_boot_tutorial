package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App 
{
    @RequestMapping("/")
    String home() {
        // return "Hello World!";
        return "Hello Spring Boot!";
    }
    
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
}
