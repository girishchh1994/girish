package com.niit.shoppingcart.service;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;

public interface SupplierService {

	public boolean save(Supplier s);
	public List<Supplier> list();
	public boolean update(Supplier s);
	public boolean delete(Supplier s);
	public boolean delete(int s_id);
	public Supplier getSupplierByID(int s_id);
}
