package com.ysp.app;

import com.ysp.dao.PassPerDao;
import com.ysp.entity.Person;

public class GetpersonById {

	public static void main(String[] args) {
		PassPerDao dao = new PassPerDao();
		Person person = dao.getPersonById(1);
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getMobNo());
		System.out.println(person.getEmail());
		

	}

}
