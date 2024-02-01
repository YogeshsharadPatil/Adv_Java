package com.ysp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ysp.Entity.Customer;

public class Customerdao {

	// take the object to add the customer
	public void add(Customer customer) {
		// Write hibernate code to add the customer
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo"); // this is the name from
																								// Meta-INF
																								// persistence.xml file
		// now create Entity manager object
		EntityManager em = emf.createEntityManager();
		// Start the transiction
		em.getTransaction().begin();
		// now i got the refernce of the Entitty manager from that reference you will
		// get methods from Entity manager
		em.persist(customer); // persistence will helps to insert
		// commit the transiction
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public List<Customer> allCustomers() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		// for fetching all you have to write createQuery
		Query q = em.createQuery("select c from Customer c");
		List<Customer> list = q.getResultList();
		em.close();
		emf.close();

		// now return the all customer data
		return list;

	}

	public Customer fetchbyid(int i) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo"); // name from IMF file
		EntityManager em = emf.createEntityManager();
		// hibernate have owm method to access perticular row from p.K
		em.getTransaction().begin();
		Customer customer = em.find(Customer.class, i);
		em.close();
		emf.close();
		return customer;
	}

	public void Update(Customer customer) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo"); // META-INF
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.merge(customer);
			em.getTransaction().commit();
		} finally {
			em.close();
			emf.close();
		}
	}

	public void delete(int idofcust) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			Customer customer = em.find(Customer.class, idofcust);
			em.remove(customer);
			em.getTransaction().commit();
			System.out.println("Customer whose id is " + idofcust + " deleted Successfully");
		} finally {
			emf.close();
			em.close();
		}
	}

}
