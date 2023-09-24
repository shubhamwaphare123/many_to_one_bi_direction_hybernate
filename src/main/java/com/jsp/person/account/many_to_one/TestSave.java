package com.jsp.person.account.many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.jsp.person.account.Account;
//import com.jsp.person.account.Person;

public class TestSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Shubham");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person=new Person();
		person.setCno(1234567);
		person.setEmail("xyz@mail.com");
		person.setName("xyz");
		person.setGender("male");
		
		
		Account account1=new Account();
		account1.setAcc_no(12345679);
		account1.setBank_name("sbi");
		account1.setIfsc("5432");
		account1.setPerson(person);
		
		
		Account account2=new Account();
		account2.setAcc_no(12345679);
		account2.setBank_name("sbi");
		account2.setIfsc("5432");
		account2.setPerson(person);
		
		Account account3=new Account();
		account3.setAcc_no(12345679);
		account3.setBank_name("sbi");
		account3.setIfsc("5432");
		account3.setPerson(person);
		Account account4=new Account();
		account4.setAcc_no(12345679);
		account4.setBank_name("sbi");
		account4.setIfsc("5432");
		account4.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityManager.persist(account3);
		entityManager.persist(account4);
		

		entityTransaction.commit();
	}

}
