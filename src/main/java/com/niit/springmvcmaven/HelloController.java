package com.niit.springmvcmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/isValidUser")
	public ModelAndView showMessage(@RequestParam(value="Username")String Username,
	@RequestParam(value="password") String password){
		System.out.println("in controller");
	
		String message;
		if(userDAO.isValidUser( Username,password)){
			message="Valid credential";
			
		}
		else{
			message="invalid credential";
		}
		ModelAndView mv=new ModelAndView("success");
		mv.addObject("message",message);
		mv.addObject("name",Username);
	//mv.addObject("password",password);
		return mv;
		
		
		
	}
	

}
