package com.k8s.backend.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHandler {

	@GetMapping("/")
	public String  helloWorld()
	{
		return "Hello World!";
	}
	@GetMapping("/submit")
	public String acceptFormData()
	{
		return "After Accept";
	}
}
