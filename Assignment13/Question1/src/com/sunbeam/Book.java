package com.sunbeam;



	import java.util.Objects;
	import java.util.Scanner;

	public class Book {
		private String isbn;
		private double price;
		private String authorName;
		private int quantity;

		public Book() {

		}

		public Book(String isbn, double price, String authorNames, int quantity) {
			super();
			this.isbn = isbn;
			this.price = price;
			this.authorName = authorName;
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
			return authorName;
		}

		public void setAuthorname(String authorname) {
			this.authorName = authorName;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
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
			if(obj instanceof Book) {
				Book other = (Book) obj;
				if(this.isbn == other.isbn)
					return true;
			}
			return false;
		}
		
//		public int compareTo(Book other) {
//			int diff = this.isbn - other.isbn;
//			return diff;
//		
		
		}
	
	
		
		
		
		
		
		
		
		

		