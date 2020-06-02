package com.example.myCreation;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/hello")
	@PreAuthorize("permitAll()")
	public String hello(){
		return "Hello World!!";
	}

	@GetMapping("/hi")
	@PreAuthorize("hasRole('ROLE_USER')")
	public String hi(){
		return "Hello World!!";
	}
}
