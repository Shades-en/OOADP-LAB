package strategy;

public class RCustomer extends Customer {
	public RCustomer(String name) {
		super(name);
		this.d = new RCDiscount();
	}
}
