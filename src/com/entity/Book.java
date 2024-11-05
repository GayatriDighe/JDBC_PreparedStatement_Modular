package com.entity;

public class Book {

	 private int bid; 
	 private String book_name;
	 private String book_type;
	 private int book_price;
	 

public Book() {
	 
}
public Book(int bid, String book_name, String book_type, int book_price) {
	super();
	this.bid = bid;
	this.book_name = book_name;
	this.book_type = book_type;
	this.book_price = book_price;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public String getBook_type() {
	return book_type;
}
public void setBook_type(String book_type) {
	this.book_type = book_type;
}
public int getBook_price() {
	return book_price;
}
public void setBook_price(int book_price) {
	this.book_price = book_price;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", book_name=" + book_name + ", book_type=" + book_type + ", book_price=" + book_price
			+ "]";
}
}
