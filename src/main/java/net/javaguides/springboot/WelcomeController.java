package net.javaguides.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Deploying Spring boot rest api application on AWS using Elastic beanstalk";
		
	}
}
