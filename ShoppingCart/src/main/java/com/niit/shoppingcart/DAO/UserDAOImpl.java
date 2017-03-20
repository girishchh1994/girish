package com.niit.shoppingcart.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Authorization;
import com.niit.shoppingcart.model.User;
@Repository
public class UserDAOImpl implements UserDAO {

SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public boolean save(User u) {
		try{
			Authorization author=new Authorization();
			author.setName(u.getName());
			author.setEnable("true");
			
			u.setRole("ROLE_USER");
			sessionFactory.getCurrentSession().save(u);
			sessionFactory.getCurrentSession().persist(author);
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
	}
	public boolean saveOrUpdate(User u)
	{
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(u);
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
	}

	public 	List<User> list()
	{
		System.out.println("In user dao");

		return	sessionFactory.getCurrentSession().createQuery("from User").list();
	}
	public boolean update(User u)
	{
		try{
			System.out.println("update try");
		sessionFactory.getCurrentSession().update(u);
		return true;
		}
		catch(Exception e)
		{
			System.out.println("update catch");
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean delete(User u)
	{
		try{
			sessionFactory.getCurrentSession().delete(u);
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}

	}
	public boolean delete(String name)
	{
		try{
			sessionFactory.getCurrentSession().delete(getUserByName(name));
			return true;
			}
			catch(Exception e)
			{	System.out.println("Galat Kr Rha hai");
				e.printStackTrace();
				return false;
			}

	}
	public User getUserByName(String name)
	{		System.out.println("Thori or kosish kr");
		  return  (User)sessionFactory.getCurrentSession().createQuery("from User where name = '"+name + "'").uniqueResult();

	}
	public boolean validate(String name, String pwd) 
	{
		
	Session	session = sessionFactory.getCurrentSession();

		String hql = "from User where username='"+name+"' and password='"+ pwd+"'";
		if (session.createQuery(hql).uniqueResult() != null) {
			return true;
		}
		return false;
	}
}

