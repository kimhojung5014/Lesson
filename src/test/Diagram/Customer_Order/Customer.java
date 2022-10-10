package test.Diagram.Customer_Order;

import java.util.ArrayList;

public class Customer {
	private String name;
	private String payment;
	private ArrayList<Order>orders;
	
	public Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();
		orders.add(null);
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void addOrders(Order order) {
		orders.add(order);
	}
}
