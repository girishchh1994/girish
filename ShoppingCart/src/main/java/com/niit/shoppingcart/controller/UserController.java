package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcart.service.UserService;

@Controller
public class UserController {

	private UserService userService;
	@Autowired
	private HttpSession session;
	
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
	@RequestMapping("/validate")
	public ModelAndView validateCredentials(@RequestParam("email") String name, @RequestParam("password") String pwd)
	{
		ModelAndView mv = new ModelAndView("/Home");

		if (userService.validate(name, pwd)) {

			User user = userService.getUserByName(name);

			if (user.getRole().equals("ROLE_ADMIN")) {
				mv.addObject("role", true);

			} else {
				mv.addObject("role", false);
			}
			mv.addObject("successMessage", "Login Successful.");
			session.setAttribute("loginMessage", "Welcome : " + name);
		} else {
			mv.addObject("errorMessage", "Login Failed.");
		}
		return mv;
}
	
	@RequestMapping("/useradd")
	public  String userAdd(@ModelAttribute("user") User u)
	{
		userService.save(u);
		return "redirect:/index";
		
	}
	@RequestMapping("/loginError")
	public ModelAndView showLoginError()
	{
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("errorMessage", "Login Failed.");
		return mv;
	}
	
	@RequestMapping("/accessDenied")
	public ModelAndView showAccessDenied()
	{
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("errorMessage", "Login Failed.");
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
