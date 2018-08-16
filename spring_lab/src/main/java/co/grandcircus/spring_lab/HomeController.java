package co.grandcircus.spring_lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView indexPage() {
		return new ModelAndView("welcome", "test", "Welcome to GC Coffee");
	}
	
	@RequestMapping("/register")
	public String testPage() {
		return "register"; //String methods in the controller class return the view
	}
	
	@RequestMapping("/username")
	public ModelAndView formData(@RequestParam("firstName") String fName) {
		return new ModelAndView("adduser", "personName", fName);
	}
}

