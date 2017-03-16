package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
