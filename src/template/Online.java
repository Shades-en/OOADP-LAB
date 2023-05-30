package template;

import java.util.ArrayList;
import java.util.Scanner;

public class Online extends OrderProcess {
	Scanner scanner = new Scanner(System.in);
	int totalPrice = 0;
	ArrayList<String> items = new ArrayList<>();
	@Override
	protected void selectItem() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Enter item name to Compare the prices. Enter 1 to exit.");
			String name = scanner.next();
			if(name.equals("1"))
				break;
			else {
				totalPrice+=menu.get(name);
				items.add(name);
			}
		}
		System.out.println("Comparing prices");
		for(String item: items) {
			System.out.println(item+" : "+menu.get(item));
		}
	}

	@Override
	protected void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("\nNow paying amount "+totalPrice+" through net banking.");
	}

	@Override
	protected void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("\nEnter Delivery address");
		String addr = scanner.next();
		System.out.println("Delivery cost to "+addr+" will be additional 70 Rs.");
	}

}
