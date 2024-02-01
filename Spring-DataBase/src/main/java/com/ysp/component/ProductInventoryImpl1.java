package com.ysp.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductInventoryImpl1 implements ProductInventory {
	String url = "jdbc:mysql://localhost:3306/advjava";
	String username = "root";
	String pwd = "cdac";
	String insertQ = "insert into tbl_product (name,quantity, price ) values (?, ?, ?)";
	String selectAllQ = "Select * from tbl_product";

	@Override
	public void add(Product product) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, pwd);
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
		Connection conn = null;
		Product product=null;
		List<Product> list = new ArrayList<Product>();
		try {
			conn = DriverManager.getConnection(url, username, pwd);
			PreparedStatement stmt = conn.prepareStatement(selectAllQ);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int quantity = rs.getInt(3);
				double price = rs.getDouble(4);
				product = new Product(id,name,quantity,price);
				list.add(product);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
