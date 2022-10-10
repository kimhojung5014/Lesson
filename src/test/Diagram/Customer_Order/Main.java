package test.Diagram.Customer_Order;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("김호중");
		customer.setPayment("카드");
		
		Order order = new Order("자동차");
		order.setCount("1개");
		order.setPrice("3000만원");
		customer.addOrders(order);
		
		System.out.println(customer.getName()+customer.getPayment()+customer.getOrders());
	}

}
