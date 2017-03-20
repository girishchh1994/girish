package com.niit.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryDAO categoryDAO;

	public void setCategoryDAO(CategoryDAO categoryDAO) {
	this.categoryDAO = categoryDAO;
}
	
	public boolean save(Category c) {
		
			return categoryDAO.save(c);
	}
	public boolean saveOrUpdate(Category c)
	{
		return categoryDAO.saveOrUpdate(c);
	}
	public 	List<Category> list()
	{
		return categoryDAO.list();
	}
	public boolean update(Category c)
	{
		return categoryDAO.update(c);

	}
	
	public boolean delete(Category c)
	{
		return categoryDAO.delete(c);
		

	}
	public boolean delete(int c_id)
	{
		return categoryDAO.delete(c_id);

	}
	public Category getCategoryByID(int c_id)
	{
		return categoryDAO.getCategoryByID(c_id);
	}

}
