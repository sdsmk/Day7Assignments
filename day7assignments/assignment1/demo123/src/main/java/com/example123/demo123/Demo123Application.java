package com.example123.demo123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example123.demo123controller","com.example123.demo123model","com.example123.demo123repository","com.example123.demo123service"})

@SpringBootApplication
public class Demo123Application {

	public static void main(String[] args) {
		ApplicationContext ct= SpringApplication.run(Demo123Application.class, args);
	}

}
