package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

@RequestMapping("/")
public ModelAndView index()
{
ModelAndView mv = new ModelAndView("/index");
return mv;
}

@RequestMapping("/login")
public ModelAndView login()
{
ModelAndView mv = new ModelAndView("/index");
mv.addObject("LoginClicked","true");
return mv;
}

@RequestMapping("/register")
public ModelAndView register()
{
ModelAndView mv = new ModelAndView("/index");
mv.addObject("RegisterClicked","true");
return mv;
}
}
