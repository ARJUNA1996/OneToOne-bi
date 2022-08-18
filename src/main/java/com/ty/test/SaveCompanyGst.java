package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class SaveCompanyGst {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		Company company=new Company();
		company.setCompanyName("Test Yentra");
		company.setAddress("BANASHANKARI ");
		company.setPhoneNuber(9000517458l);
		
		
		Gst gst=new Gst();
		gst.setGstNumber("GSTST865336262");
		gst.setGstType("STATE GST");
		gst.setCompany(company);
		
		Company company1=new Company();
		company1.setCompanyName("Test Yentra");
		company1.setAddress("BANASHANKARI ");
		company1.setPhoneNuber(9000517458l);
		
		
		Gst gst1=new Gst();
		gst1.setGstNumber("GSTST865336262");
		gst1.setGstType("STATE GST");
		gst1.setCompany(company1);
		transaction.begin();
		manager.persist(company);
		manager.persist(company1);
		manager.persist(gst);
		manager.persist(gst1);
		transaction.commit();
		
		
		
		
	}

}
