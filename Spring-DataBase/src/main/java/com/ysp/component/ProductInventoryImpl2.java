package com.ysp.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("productInventory2")
public class ProductInventoryImpl2 implements ProductInventory{
	String insertQ = "insert into tbl_product (name,quantity, price ) values (?, ?, ?)";
	String selectAllQ = "Select * from tbl_product";
	
	@Autowired   //get the object of datasource
	private DataSource datasource;
	@Override
	public void add(Product product) {
		Connection conn = null;
		try {
			conn = datasource.getConnection();
			PreparedStatement stmt = conn.prepareStatement(insertQ);
			stmt.setString(1, product.getName());
			stmt.setInt(2, product.getQuantity());
			stmt.setDouble(3, product.getPrice());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return null;
	}

}
