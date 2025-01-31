package ecommerce;

import java.util.Arrays;

public class User {
	
	public static final int DISCOUNT_THRESHOLD_USD = 1000;
	public static final double FIVE_PERCENT_DISCOUNT = 0.05;
	
	public static int counter;
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Product[] products;
	
	{
		++counter;
	}
	
	public static void doAnyStaticAction() {
		System.out.println("Static method in user class is called");
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		User.counter = counter;
	}

	



}
