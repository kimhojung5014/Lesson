package test.Diagram.Customer_Order;

import java.util.ArrayList;

public class Order {
	private String name;
	private String count;
	private String price;
	private ArrayList<Customer>customers;
	
	public Order(String name) {
		this.name = name;
		customers = new ArrayList<Customer>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void addCustomers(Customer customer) {
		customers.add(customer);
	}
		
		
}
