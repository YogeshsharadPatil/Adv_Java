package com.ysp.component;

import org.springframework.data.repository.CrudRepository;

import com.ysp.Entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
