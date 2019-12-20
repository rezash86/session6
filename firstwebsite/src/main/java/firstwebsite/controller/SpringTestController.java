package firstwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringTestController {
	
	//http://localhost:8080/firstwebsite/welcome
	@RequestMapping("/welcome")
	public String welcomeLocator() {
		System.out.println("yes I am arrived to contoller");
		return "welcome";
	}
	
	//http://localhost:8080/firstwebsite/welcomestudents
	@RequestMapping("/welcomestudents")
	public String secondwelcomeLocator() {
		System.out.println("yes I am arrived to second method contoller");
		return "secondpage";
	}
}
