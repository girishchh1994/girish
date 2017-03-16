package com.niit.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.shoppingcart.DAO.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;
@Service
public class SupplierServiceImpl implements SupplierService {

	private SupplierDAO supplierDAO;

	public void setSupplierDAO(SupplierDAO supplierDAO) {
	this.supplierDAO = supplierDAO;
}
	
	public boolean save(Supplier s) {
		
			return supplierDAO.save(s);
	}
	public 	List<Supplier> list()
	{
		return supplierDAO.list();
	}
	public boolean update(Supplier s)
	{
		return supplierDAO.update(s);

	}
	
	public boolean delete(Supplier s)
	{
		return supplierDAO.delete(s);
		

	}
	public boolean delete(int s_id)
	{
		return supplierDAO.delete(s_id);

	}
	public Supplier getSupplierByID(int s_id)
	{
		return supplierDAO.getSupplierByID(s_id);
	}

}
