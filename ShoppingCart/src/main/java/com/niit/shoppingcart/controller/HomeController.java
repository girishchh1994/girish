package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.User;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView showHomePage()
	{
		ModelAndView mv = new ModelAndView("/Home");
		return mv;
	}
	
	@RequestMapping("/Home")
	public ModelAndView showHomePage1()
	{
		ModelAndView mv = new ModelAndView("/Header");
		return mv;
	}
	@RequestMapping("/index")
	public ModelAndView showIndexPage()
	{
		ModelAndView mv = new ModelAndView("/Register");
		return mv;
	}
	
	
	
	@RequestMapping("/Login")
	public ModelAndView showLoginPage()
	{
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("loginClicked","true");
		return mv;
	}
	
	
	
	
	
}
