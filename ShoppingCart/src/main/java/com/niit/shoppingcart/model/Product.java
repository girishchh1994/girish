package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name = "ID")
	private int p_id;
	 @Column(name = "Name")
	
	private String p_name;
	 @Column(name = "Description")
	private String p_desc;
	 @Column(name = "Price")
	private long p_price;
	 private String category_id;
	 private String supplier_id;
	 public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	@ManyToOne
		@JoinColumn(name = "category_id", updatable = false, insertable = false, nullable = false)
		private Category category;

		public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
		@ManyToOne
		@JoinColumn(name = "supplier_id", nullable = false, updatable = false, insertable = false)
		private Supplier supplier;
	@Transient
    private MultipartFile p_img;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_desc() {
		return p_desc;
	}
	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}
	public long getP_price() {
		return p_price;
	}
	public void setP_price(long p_price) {
		this.p_price = p_price;
	}
	public MultipartFile getP_img() {
		return p_img;
	}
	public void setP_img(MultipartFile p_img) {
		this.p_img = p_img;
	}
	
}
