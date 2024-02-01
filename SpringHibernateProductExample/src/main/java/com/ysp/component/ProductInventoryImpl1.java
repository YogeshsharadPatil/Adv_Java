package com.ysp.component;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ysp.Entity.Product;
@Component("productInventory")
public class ProductInventoryImpl1 implements ProductInventory {
	
	//@Autowired  //Autowired annotation is not in case of EntityManager Objects
	@PersistenceContext
	public EntityManager em;
	
	@Transactional  //Every DMl operation must be in transiction|(ACID properties)
	@Override       //so what we do in hibernate that em.gettransiction.begin(),commit,rollback . So we have Annotation @transactional
	public void add(Product product) {
		em.persist(product);   //we did the configuration in the config.xml file regarding in which db u have to add the data
	}

	@Override
	public List<Product> getAllproducts() {
	Query q	=em.createQuery("Select p from Product p");
	List<Product> list=q.getResultList();
	return list;
	}
	
}
