package com.ysp.app;

import java.util.List;

import com.ysp.dao.PassPerDao;
import com.ysp.entity.Person;
public class GetAllPersons {

	public static void main(String[] args) {
		PassPerDao dao = new PassPerDao();
		List<Person> persons=dao.getAllPersons();
		
		for(Person p:persons) {
			System.out.println(p.getName());
			System.out.println(p.getEmail());
			System.out.println(p.getMobNo());
			System.out.println("_____________________________");
		}
	}
}
