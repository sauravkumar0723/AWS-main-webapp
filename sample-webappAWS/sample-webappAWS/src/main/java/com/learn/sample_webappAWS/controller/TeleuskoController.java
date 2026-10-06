package com.learn.sample_webappAWS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeleuskoController {
	
	@GetMapping("/")
	public String home()
	{
		return "Welcome to AWS Learning";
	}

	@GetMapping("/info")
	public String getInformation()
	{
		return "Visit teleusko for courses information";
	}
}
