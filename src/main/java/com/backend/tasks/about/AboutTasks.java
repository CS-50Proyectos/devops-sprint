package com.backend.tasks.about;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutTasks {
	
	@GetMapping("/about")
	
	public String about() {
		return "Mi primer API con Spring Boot";
	}
}
