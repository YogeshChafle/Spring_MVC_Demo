package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.ModelA.User;

@Controller
public class contactController {
	
	@RequestMapping("/contact")
	public String Showform() {
		return "contact";
	}
	//THis is method is using @RequestParam;
//	@RequestMapping(value = "/process", method=RequestMethod.POST)
//	public String HandleForm(@RequestParam("email")String user_EMAIL,
//							 @RequestParam("password")String user_PASSWORD,
//							 Model model
//			) {
//		System.out.println("Email is "+ user_EMAIL);
//		System.out.println("Password is "+ user_PASSWORD);
//		
//		//process
//		model.addAttribute("emai", user_EMAIL);
//		model.addAttribute("password", user_PASSWORD);
//		return "success";
	@RequestMapping(value = "/process", method=RequestMethod.POST)
	public String HandleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		return "success";
	}
	
}
