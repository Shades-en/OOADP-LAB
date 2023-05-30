package observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store(10.0f, "Decathlon POS");
		Customer customer = new Customer("owais", store);
		Customer customer2 = new Customer("Jeeki", store);
		store.setDiscount(15.0f);
		
		store.unregister(customer2);
	}

}
