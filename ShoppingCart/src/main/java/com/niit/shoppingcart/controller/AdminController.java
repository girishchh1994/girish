package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	@RequestMapping("/AdminHome")
	public ModelAndView showAdminHome()
	{
		ModelAndView mv = new ModelAndView("/Admin/AdminHome");
		return mv;
	}
	
	

}
