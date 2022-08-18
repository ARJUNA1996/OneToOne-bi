package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class SavePerson {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Person person = new Person();
		person.setName("MALLIKARJUNA");
		person.setAge(26);

		Pan pan = new Pan();
		pan.setPanNumber("TYOC78934");
		pan.setFatherName("NAGABHUSHANAM");

		person.setPan(pan);

		Person person1 = new Person();
		person1.setName("MAHESH");
		person1.setAge(26);

		Pan pan1 = new Pan();
		pan1.setPanNumber("TYMD78934");
		pan1.setFatherName("NAGABHUSHANAM");

		pan.setPerson(person);
		pan1.setPerson(person1);
		
		
		transaction.begin();
		manager.persist(person);
		manager.persist(person1);
		manager.persist(pan);
		manager.persist(pan1);
		transaction.commit();

	}
}
