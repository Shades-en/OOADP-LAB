package bridge;

public abstract class Customer {
	String name, type;
	Discount d;
	public Customer(String name, Discount d) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.d = d;
	}

	public void setDiscount(Discount d) {
		this.d = d;
	}
	
	public void printBill(float amt) {
		System.out.println("Name is "+this.name);
		System.out.println("Amount is "+amt);
		System.out.println("Discount is "+ d.getDiscount(amt));
		System.out.println("Final amount is "+ (amt - d.getDiscount(amt)));
		System.out.println("type of customer is "+type);
		System.out.println();
	}
}
