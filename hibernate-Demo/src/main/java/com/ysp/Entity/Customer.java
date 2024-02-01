package com.ysp.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cust_tbl")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name = "cust_Id")
	int id;
	@Column(name = "Name")
	String name;
	@Column(name = "Email", unique = true)
	String email;
	@Column(name = "Date_of_Birth")
	LocalDate Date_of_Birth;
	@Column(name = "City")
	String city;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String email, LocalDate date_of_Birth, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		Date_of_Birth = date_of_Birth;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate_of_Birth() {
		return Date_of_Birth;
	}

	public void setDate_of_Birth(LocalDate dt) {
		Date_of_Birth = dt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
