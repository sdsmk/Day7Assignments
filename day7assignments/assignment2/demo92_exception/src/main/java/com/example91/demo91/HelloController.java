package com.example91.demo91;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController  {
	@GetMapping("/abc")
	String met()
	{
		return "Helllooooooo";
	}
	
	@PostMapping("/def")
	String met9()
	{
		return "This is post method";
	}
}