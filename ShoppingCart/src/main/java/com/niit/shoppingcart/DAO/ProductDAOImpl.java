package com.niit.shoppingcart.DAO;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Product;
@Repository
public class ProductDAOImpl implements ProductDAO {

SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public boolean save(Product p) {
		try{
			sessionFactory.getCurrentSession().save(p);
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
	}
	public 	List<Product> list()
	{
		return	sessionFactory.getCurrentSession().createQuery("from Product").list();
	}
	public boolean update(Product p)
	{
		try{
		sessionFactory.getCurrentSession().update(p);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean delete(Product p)
	{
		try{
			sessionFactory.getCurrentSession().delete(p);
			return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}

	}
	public boolean delete(int p_id)
	{
		try{
			sessionFactory.getCurrentSession().delete(getProductByID(p_id));
			return true;
			}
			catch(Exception e)
			{	System.out.println("Galat Kr Rha hai");
				e.printStackTrace();
				return false;
			}

	}
	public Product getProductByID(int p_id)
	{		System.out.println("Thori or kosish kr");
		  return  (Product)sessionFactory.getCurrentSession().createQuery("from Product where id = '"+p_id + "'").uniqueResult();

	}
}
