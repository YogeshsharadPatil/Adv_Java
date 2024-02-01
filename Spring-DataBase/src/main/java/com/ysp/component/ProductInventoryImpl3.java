package com.ysp.component;

import java.beans.BeanProperty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("productInventory3")
public class ProductInventoryImpl3 implements ProductInventory{
	String insertQ = "insert into tbl_product (name,quantity, price ) values (?, ?, ?)";
	String selectAllQ = "Select * from tbl_product";
	
	@Autowired   //get the object of datasource
	private DataSource datasource;
	@Override
	public void add(Product product) {
		JdbcTemplate jt = new JdbcTemplate(datasource);
		jt.update(insertQ,product.getName(),product.getQuantity(),product.getPrice());
	}

	@Override
	public List<Product> getAllProducts() {
		JdbcTemplate jt = new JdbcTemplate(datasource);
	List<Product> list	=jt.query(selectAllQ, BeanPropertyRowMapper.newInstance(Product.class));
		
		return list;
	}

}
