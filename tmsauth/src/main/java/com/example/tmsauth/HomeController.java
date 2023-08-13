package com.example.tmsauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "<a href='/tms'>Click here to sign-in</a>";
	}
	
	@GetMapping("/tms")
	public String signIn()
	{
		return "";
	}
}
