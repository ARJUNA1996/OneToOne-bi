package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class GetPersonPanTest {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		Person person=manager.find(Person.class, 1);
		
			
			System.out.println(person.getName());
			System.out.println(person.getAge());
			Pan pan=person.getPan();
			System.out.println(pan.getFatherName());
			System.out.println(pan.getPanNumber());
		
		
		
		

		
		
	}

}
