package com.niit.shoppingcart.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.model.User;
@Service
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
	this.userDAO = userDAO;
}


@Transactional
	public void addUser(User u) {
		userDAO.addUser(u);
		
	}

}
