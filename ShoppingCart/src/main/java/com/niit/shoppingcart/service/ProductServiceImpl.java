package com.niit.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.DAO.ProductDAO;
import com.niit.shoppingcart.model.Product;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO;

	public void setProductDAO(ProductDAO productDAO) {
	this.productDAO = productDAO;
}
	
	public boolean save(Product p) {
		
			return productDAO.save(p);
	}
	public 	List<Product> list()
	{
		return productDAO.list();
	}
	public boolean update(Product p)
	{
		return productDAO.update(p);

	}
	
	public boolean delete(Product p)
	{
		return productDAO.delete(p);
		

	}
	public boolean delete(int p_id)
	{
		return productDAO.delete(p_id);

	}
	public Product getProductByID(int p_id)
	{
		return productDAO.getProductByID(p_id);
	}

}
