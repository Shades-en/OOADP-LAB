package bridge;

public class FCustomer extends Customer {

	public FCustomer(String name, Discount d) {
		// TODO Auto-generated constructor stub
		super(name, d);
		this.type = "First Time Customer";
	}

}
