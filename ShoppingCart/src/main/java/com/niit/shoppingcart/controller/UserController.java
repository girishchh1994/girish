package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcart.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	@Autowired(required=true)
		public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/Register")
	public ModelAndView showRegisterPage()
	{
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("registerClicked","true");
		mv.addObject("user",new User());

        return mv;
	}
	
	@RequestMapping("/useradd")
	public  String userAdd(@ModelAttribute("user") User u)
	{
		userService.addUser(u);
		return "redirect:/index";
		
	}
}
