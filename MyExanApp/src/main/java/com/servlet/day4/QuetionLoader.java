package com.servlet.day4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuetionLoader {
	public List<Quetion> loadQuestions() {
		Connection conn = null;
		List <Quetion> list = new ArrayList<Quetion>();
		try {
				//load the class
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","cdac");
				//write query to get data from the db
				String getdata = " select * from tbl_question";
				PreparedStatement stmt = conn.prepareStatement(getdata);
			ResultSet rs =	stmt.executeQuery();
				
				while(rs.next()) {
					Quetion q = new Quetion();
					q.setId(rs.getInt(1));
					q.setQuetion(rs.getString(2));
					q.setOption1(rs.getString(3));
					q.setOption2(rs.getString(4));
					q.setOption3(rs.getString(5));
					q.setOption4(rs.getString(6));
					q.setRight_ans(rs.getString(7));
					list.add(q);
				}
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	

	}
}

