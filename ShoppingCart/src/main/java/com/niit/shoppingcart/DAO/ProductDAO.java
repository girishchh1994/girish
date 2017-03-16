package com.niit.shoppingcart.DAO;

import java.util.List;

import com.niit.shoppingcart.model.Product;

public interface ProductDAO {
	public boolean save(Product p);
	public List<Product> list();
	public boolean update(Product p);
	public boolean delete(Product p);
	public boolean delete(int p_id);
	public Product getProductByID(int p_id);

}
