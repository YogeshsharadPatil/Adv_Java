package com.ysp.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="tbl_passport")
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //By Id as generated Type Auto_increment from 1
	@Column(name="Passport_Id")
	private int id;
	private String issuedBy;
	private LocalDate issueDate;
	private LocalDate expiryDate;
	
	@OneToOne(cascade = CascadeType.ALL)   //tell hibernate what is your relation
	@JoinColumn(name="Person_id")   //u r joining column on which basis
	private Person person;
	public Passport() {
		super();
	}

	public Passport(int id, String issuedBy, LocalDate issueDate, LocalDate expiryDate, Person person) {
		super();
		this.id = id;
		this.issuedBy = issuedBy;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
}
