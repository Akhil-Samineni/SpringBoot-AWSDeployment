package com.spring.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAWS {

    @GetMapping("/")
    public String home(){
        return "Welcome to AWS first deployemnt.";
    }

    public static void main(String args[]){
        SpringApplication.run(SpringBootAWS.class);
    }
}
