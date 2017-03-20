package com.niit.shoppingcart.DAO;

import java.util.List;

import com.niit.shoppingcart.model.User;

public interface UserDAO {
	public boolean save(User u);
	public List<User> list();
	public boolean update(User u);
	public boolean delete(User u);
	public boolean delete(String name);
	public User getUserByName(String name);
	public boolean saveOrUpdate(User u);
	public boolean validate(String name, String pwd) ;

	}
