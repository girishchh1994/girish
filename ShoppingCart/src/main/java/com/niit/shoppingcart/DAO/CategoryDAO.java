package com.niit.shoppingcart.DAO;

import java.util.List;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO {
	
	public boolean save(Category c);
	public List<Category> list();
	public boolean update(Category c);
	public boolean delete(Category c);
	public boolean delete(int c_id);
	public Category getCategoryByID(int c_id);
	public boolean saveOrUpdate(Category c);

}
