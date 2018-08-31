package com.manman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com/manman")
@EnableAutoConfiguration
public class getDemo {
    public static void main(String[] args){
        SpringApplication.run(DemoAPI.class, args);
    }
}
