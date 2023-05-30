package factory;

public class CustomerFactory {
	public Customer createCustomer(String type) {
		if(type=="regular")
			return new RCustomer();
		else if(type=="first")
			return new FCustomer();
		else if(type=="senior")
			return new SCustomer();
		else
			return null;
	}
}
