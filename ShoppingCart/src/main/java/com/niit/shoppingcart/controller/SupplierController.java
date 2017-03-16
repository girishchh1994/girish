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
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.service.SupplierService;

@Controller
public class SupplierController {
	private SupplierService supplierService;

	@Autowired(required=true)
		public void setSupplierService(SupplierService supplierService) {
		this.supplierService = supplierService;
	}
	
	@RequestMapping("/Supplier")
	public ModelAndView showSupplierAdd()
	{
		ModelAndView mv = new ModelAndView("/SupplierAdd");
		mv.addObject("supplier",new Supplier());
		mv.addObject("supplierList",supplierService.list());

		return mv;

	}
	@RequestMapping(value="/supplierAdd", method = RequestMethod.POST)
	public ModelAndView insertProduct(@Valid @ModelAttribute("supplier") Supplier s, BindingResult result, Model model,
			HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("/SupplierAdd");
		this.supplierService.save(s);

		mv.addObject("supplierList",supplierService.list());
		return mv;
		
	}
	
	@RequestMapping("/delete_Supplier/{id}")
	public ModelAndView deleteSupplier(@PathVariable("id") int id)
	{
		ModelAndView mv = new ModelAndView("/SupplierAdd");
		boolean b=this.supplierService.delete(id);
		if(b){
			System.out.println("delete ho gaya");
		}
	    return mv;
	}	

}



