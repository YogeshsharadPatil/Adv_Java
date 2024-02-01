package com.ysp.entity;

public class Book {
	int id;
	String title;
	String Author;
	float price;
	
	public Book() {
		super();
	}
	public Book(int id, String title, String author, float price) {
		super();
		this.id = id;
		this.title = title;
		Author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
