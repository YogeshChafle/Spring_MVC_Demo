package com.spring;

//import java.time.LocalDateTime;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;


@Controller
public class HelloController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Yogesh Chafle");
		model.addAttribute("ID", "Capg9049");
		model.addAttribute("Age", 22);
//		List<String> friends = new ArrayList<String>();
//		friends.add("Om");
//		friends.add("Sahil");
//		friends.add("Rohit");
//		
//		model.addAttribute("f", "friends");
		System.out.println("Welcome to Home page");
		return "HelloPage";
	}
	
	@RequestMapping("/about")
	public String about() { 
		return "About";
	}
	
	@RequestMapping(value="/help",method=RequestMethod.GET)
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView("help");
		System.out.println("This is help page");
		modelAndView.addObject("name", "Ganesh");
		modelAndView.addObject("roll", "60");
//		LocalDateTime now = LocalDateTime.now();
//		modelAndView.addObject("time", now);

//		modelAndView.setViewName();
		System.out.println(modelAndView);
		return modelAndView; 
		
	}
}
