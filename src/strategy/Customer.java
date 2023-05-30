package strategy;

public abstract class Customer {
	String name;
	Discount d;
	
	Customer(String name){
		this.name = name;
	}
	
	public void printBill(float amt) {
		System.out.println("\nName is "+this.name);
		System.out.println("Amount is "+amt);
		System.out.println("Discount is "+ d.getDiscount(amt));
		System.out.println("Final amount is "+ (amt - d.getDiscount(amt)));
	}
}
