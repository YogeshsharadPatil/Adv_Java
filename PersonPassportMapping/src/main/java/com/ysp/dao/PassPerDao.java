package com.ysp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ysp.entity.Passport;
import com.ysp.entity.Person;

public class PassPerDao {

	public void addPerson(Person person) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("PersonPassportMapping");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(person);
			em.getTransaction().commit();
		} finally {
			emf.close();
			em.close();
		}

	}
	public void addPasspot(Passport passport) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("PersonPassportMapping");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(passport);
			em.getTransaction().commit();
		} finally {
			emf.close();
			em.close();
		}
	}
	
	public List<Person> getAllPersons(){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("PersonPassportMapping");
			em = emf.createEntityManager();
			Query q	=em.createQuery("select c from Person c");
			em.getTransaction().begin();
			List<Person> persons =	q.getResultList();
			em.getTransaction().commit();
			return persons;
		} finally {
			emf.close();
			em.close();
		}
	}
	
	public List<Passport> getAllPassport(){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("PersonPassportMapping");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			Query q	=em.createQuery("select c from Passport c");
			List<Passport> passports =	q.getResultList();
			em.getTransaction().commit();
			return passports;
		} finally {
			emf.close();
			em.close();
		}
	}
	
	public Person getPersonById(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("PersonPassportMapping");
			em = emf.createEntityManager();
			
			em.getTransaction().begin();
			Query q	=em.createQuery("select p from Person p where p.id=?1");
			Person person =em.find(Person.class, id);
			em.getTransaction().commit();
			return person;
		} finally {
			emf.close();
			em.close();
		}
		
	}
	
	public Passport getPersonByPassportId(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("PersonPassportMapping");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			Passport passperson =	(Passport) em.createQuery("");
			em.getTransaction().commit();
			return passperson;
		}finally {
			emf.close();
			em.close();
		}
		
	}
	

	
	

}
