package com.hello.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@GetMapping("/greet")
	public String greet() {
		return "Hello World";
	}
}
