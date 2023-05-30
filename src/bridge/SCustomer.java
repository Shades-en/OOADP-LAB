package bridge;

public class SCustomer extends Customer {

	public SCustomer(String name, Discount d) {
		// TODO Auto-generated constructor stub
		super(name, d);
		this.type = "Senior Customer";
	}

}
