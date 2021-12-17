package com.example91.demo91;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo91Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo91Application.class, args);
	}

}

/*
1 - Create Custom Exception class which extends from RuntimeException
2 - Create a ExceptionController class and annotate with @ControllerAdvice
3 - Create a method with annotation @ExceptionHandler, which takes Custom Exception object as parameter
and return ResponseEntity<>("mesage", http_status_code);
4 - From RestController method throw Custom Exception
5 - Now check its working
*/


