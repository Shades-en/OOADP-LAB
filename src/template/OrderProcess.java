package template;

import java.util.HashMap;

public abstract class OrderProcess {
	HashMap<String, Integer> menu = new HashMap<>();

	public OrderProcess() {
		// TODO Auto-generated constructor stub
		menu.put("Pant", 2500);
		menu.put("Shirt", 2000);
		menu.put("Slippers", 300);
		System.out.println("\n"+menu);
	}
	
	public void processOrder() {
		selectItem();
		doPayment();
		doDelivery();
	}
	
	protected abstract void selectItem();
	protected abstract void doPayment();
	protected abstract void doDelivery();
}
