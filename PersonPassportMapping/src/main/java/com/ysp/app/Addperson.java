package com.ysp.app;

import java.time.LocalDate;

import com.ysp.dao.PassPerDao;
import com.ysp.entity.Passport;
import com.ysp.entity.Person;

public class Addperson {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Saurabh");
		person.setEmail("saurabh@gmail.com");
		person.setMobNo(8408039572L);
		
		Passport passport = new Passport();
		passport.setIssueDate(LocalDate.of(2021, 11, 11));
		passport.setExpiryDate(LocalDate.of(2026, 11, 11));
		passport.setIssuedBy("Govt.Of India");
		passport.setPerson(person);
		
		PassPerDao dao = new PassPerDao();
		dao.addPasspot(passport);

	}

}
