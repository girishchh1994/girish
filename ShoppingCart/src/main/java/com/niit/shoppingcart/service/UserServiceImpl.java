package com.niit.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.model.User;
@Transactional
@Service
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
	this.userDAO = userDAO;
}


	public boolean save(User u)
	{
		return userDAO.save(u);
	}
	public List<User> list()
	{
		return userDAO.list();
	}
	public boolean update(User u)
	{
		return userDAO.update(u);
	}
	public boolean delete(User u)
	{
		return userDAO.delete(u);

	}
	public boolean delete(String name)
	{
		return userDAO.delete(name);
	}
	public User getUserByName(String name)
	{
		return userDAO.getUserByName(name);
	}
	public boolean saveOrUpdate(User u)
	{
		return userDAO.saveOrUpdate(u);
	}
	public boolean validate(String name, String pwd) 
	{
		return userDAO.validate(name, pwd);
	}

}
