package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;

public class GetPanById {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Pan pan = manager.find(Pan.class, 1);

		if (pan!= null) {
			System.out.println(pan);
		} else {
			System.out.println("element is not present");
		}

	}
}
