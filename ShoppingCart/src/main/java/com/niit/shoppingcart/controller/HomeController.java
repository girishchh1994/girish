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
	@Autowired
	private HttpSession session;
	
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
	
	@RequestMapping("/validate")
	public ModelAndView validateCredentials(@RequestParam("email") String id, @RequestParam("password") String pwd)
	{
		//userID=niit, pwd= niit@123
		
		ModelAndView mv = new ModelAndView("/Home");
	
		if(id.equals("niit")&&pwd.equals("niit@123"))
		{
			mv.addObject("successMessage","Valid Credentials");
			session.setAttribute("loginMessage","Welcome :"+id);

		}
		
		else
			mv.addObject("errorMessage","Invalid Credentials");
        return mv;
}
	@RequestMapping("/Logout")
	public ModelAndView showLogout()
	{
		ModelAndView mv = new ModelAndView("/Home");
		session.invalidate();
		return mv;
	}
	
	
}
