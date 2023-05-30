package template;

public class Client {
	public static void main(String[] args) {
		OrderProcess ob = new Online();
		ob.processOrder();
		
		OrderProcess ob2 = new Offline();
		ob2.processOrder();
	}
}
