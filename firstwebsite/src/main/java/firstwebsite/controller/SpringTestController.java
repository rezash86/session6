package firstwebsite.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import firstwebsite.model.Student;

@Controller
public class SpringTestController {
	
	//http://localhost:8080/firstwebsite/welcome
	@RequestMapping("/welcome")
	public String welcomeLocator(Model model) {
		System.out.println("yes I am arrived to contoller");
		model.addAttribute("mymessage", "I came from controller, my model message");
		return "welcome";
	}
	
	
	//http://localhost:8080/firstwebsite/welcomestudents
	@RequestMapping("/welcomestudents")
	public String secondwelcomeLocator() {
		System.out.println("yes I am arrived to second method contoller");
		return "secondpage";
	}
	
	@RequestMapping("/home")
	public String home1Locator(Model model) {
		System.out.println("yes I am arrived to contoller");
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		model.addAttribute("current_date", df.format(dateobj));
		return "home";
	}
	
	@RequestMapping("/home2")
	public String home2Locator(ModelMap modelmap) {
		modelmap.addAttribute("helloMsg", "welcome");
		modelmap.addAttribute("welcomeMsg", "reza");
		return "home";
	}
	
	@RequestMapping("/home3")
	public ModelAndView home3Locator() {
		
		//You can call a service to give you a list of students
		//then you can pass this value into modelandview
		
		ModelAndView modelAndView = new ModelAndView("home");
		Student student = new Student("toto");
		modelAndView.addObject(student);
		return modelAndView;
	}
}
