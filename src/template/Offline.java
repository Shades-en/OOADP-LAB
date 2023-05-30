package template;

import java.util.Scanner;

public class Offline extends OrderProcess {
	Scanner scanner = new Scanner(System.in);
	int totalPrice = 0;
	@Override
	protected void selectItem() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Enter item name to try out in store. Enter 1 to exit.");
			String name = scanner.next();
			if(name.equals("1"))
				break;
			else
				totalPrice+=menu.get(name);
		}
	}

	@Override
	protected void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Select payment option - 1. Cash \t 2. Card.");
		int opt = scanner.nextInt();
		if(opt==1)
			System.out.println("\n Now paying amount "+totalPrice+" through Cash.");
		else {
			System.out.println("\n Now paying amount "+totalPrice+" through Card.");
		}

	}

	@Override
	protected void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("\nYou can collect your items at the counter");
	}

}
