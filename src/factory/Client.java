package factory;

public class Client {
	public static void main(String[] args) {
		CustomerFactory factory = new CustomerFactory();
		Customer c1 = factory.createCustomer("regular");
		Customer c2 = factory.createCustomer("senior");
		Customer c3 = factory.createCustomer("first");
		c1.getType();
		c2.getType();
		c3.getType();
	}
}
