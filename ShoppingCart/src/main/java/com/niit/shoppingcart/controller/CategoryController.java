package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.service.CategoryService;

@Controller
public class CategoryController {
	
	private CategoryService categoryService;

	@Autowired(required=true)
		public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/Category")
	public ModelAndView showCategoryAdd()
	{
		ModelAndView mv = new ModelAndView("/Admin/CategoryAdd");
		mv.addObject("category",new Category());
		mv.addObject("categoryList",categoryService.list());

		return mv;

	}
	
	@RequestMapping(value="/categoryAdd", method = RequestMethod.POST)
	public ModelAndView insertProduct(@Valid @ModelAttribute("category") Category c, BindingResult result, Model model,
			HttpServletRequest request)throws Exception 
	{
		ModelAndView mv = new ModelAndView("forward:/Category");
		System.out.println("controller mein");
		if (categoryService.saveOrUpdate(c) == true) {
			
			model.addAttribute("msg", "Successfully created/updated the caetgory");
		} else {
			model.addAttribute("msg", "not able created/updated the caetgory");
		}

		mv.addObject("categoryList",categoryService.list());
		return mv;
		
	}
	@RequestMapping("/delete_Category/{id}")
	public ModelAndView deleteCategory(@PathVariable("id") int id)throws Exception
	{
		ModelAndView mv = new ModelAndView("forward:/Category");
		boolean b=this.categoryService.delete(id);
		if(b){
			System.out.println("delete ho gaya");
		}
	    return mv;
	}	

	@RequestMapping("/edit_Category/{id}")
	public ModelAndView editCategory(@PathVariable("id") int id)
	{ 
		ModelAndView mv = new ModelAndView("/Admin/CategoryAdd");
		System.out.println("edit vaale mein");
		mv.addObject("category", categoryService.getCategoryByID(id));
return mv;
}
}
