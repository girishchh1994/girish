package com.niit.shoppingcart.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Category;
@Repository
public class CategoryDAOImpl implements CategoryDAO {

SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public boolean save(Category c) {
		try{
			sessionFactory.getCurrentSession().save(c);
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
	}
	public boolean saveOrUpdate(Category c)
	{
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(c);
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
	}

	public 	List<Category> list()
	{
		System.out.println("In category dao");

		return	sessionFactory.getCurrentSession().createQuery("from Category").list();
	}
	public boolean update(Category c)
	{
		try{
			System.out.println("update try");
		sessionFactory.getCurrentSession().update(c);
		return true;
		}
		catch(Exception e)
		{
			System.out.println("update catch");
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean delete(Category c)
	{
		try{
			sessionFactory.getCurrentSession().delete(c);
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}

	}
	public boolean delete(int c_id)
	{
		try{
			sessionFactory.getCurrentSession().delete(getCategoryByID(c_id));
			return true;
			}
			catch(Exception e)
			{	System.out.println("Galat Kr Rha hai");
				e.printStackTrace();
				return false;
			}

	}
	public Category getCategoryByID(int c_id)
	{		System.out.println("Thori or kosish kr");
		  return  (Category)sessionFactory.getCurrentSession().get(Category.class,new Integer(c_id));

	}
}
