package in.nareshit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/show")
	public String show() {
	return "HomePage";
	}
	
	@RequestMapping("/showdata")
	public String showData() {
	return "HomePage";
	}

}
