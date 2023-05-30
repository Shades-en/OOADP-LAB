package strategy;

public class FCustomer extends Customer {

	public FCustomer(String name) {
		super(name);
		this.d = new FCDiscount();
	}
}
