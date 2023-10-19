package com.sunbeam;


import java.util.Objects;

public class Book4 implements Comparable<Book4> {
	private String isbn;
	private double price;
	private String authorNames;
	private int quantity;

	public Book4() {

	}

	public Book4(String isbn, double price, String authorNames, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorNames = authorNames;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorname() {
		return authorNames;
	}

	public void setAuthorname(String authorname, String authorNames) {
		this.authorNames = authorNames;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book2 [isbn=" + isbn + ", price=" + price + ", authorName=" + authorNames + ", quantity=" + quantity
				+ "]";
	}

	public int hashCode() {
		int hash = Objects.hash(this.isbn);
		return hash;
	}

	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Book4) {
			Book4 other = (Book4) obj;
			if(this.isbn == other.isbn)
				return true;
		}
		return false;
	}


	public int compareTo(Book4 other) {
		int diff = this.isbn.compareTo(other.isbn) ;
		return diff;
	}


}




