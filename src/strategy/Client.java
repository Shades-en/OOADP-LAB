package strategy;

public class Client {
	public static void main(String[] args) {
		Customer c1 = new RCustomer("Owais");
		c1.printBill(200);
		
		Customer c2 = new FCustomer("Jeeki");
		c2.printBill(200);
		
		Customer c3 = new SCCutomer("Prajwal");
		c3.printBill(200);
	}
}
