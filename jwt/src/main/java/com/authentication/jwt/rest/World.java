package com.authentication.jwt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class World {

	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
}
