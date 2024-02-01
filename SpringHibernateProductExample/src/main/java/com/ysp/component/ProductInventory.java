package com.ysp.component;

import java.util.List;

import com.ysp.Entity.Product;

public interface ProductInventory {
		public void add(Product product);
		public List<Product> getAllproducts();
		
		
}
