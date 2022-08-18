package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String companyName;
	private long phoneNuber;
	private String address;
	
	@OneToOne(mappedBy = "company")
	private Gst gst;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long getPhoneNuber() {
		return phoneNuber;
	}
	public void setPhoneNuber(long phoneNuber) {
		this.phoneNuber = phoneNuber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Gst getGst() {
		return gst;
	}
	public void setGst(Gst gst) {
		this.gst = gst;
	}
	
	
	
	

}
