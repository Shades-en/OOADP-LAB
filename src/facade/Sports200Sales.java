package facade;

import java.util.Scanner;

public class Sports200Sales {
	boolean giftcert;
	int qty;
	float amt;
	
	public Sports200Sales(int qty, float amt, boolean giftcert) {
		// TODO Auto-generated constructor stub
		this.qty = qty;
		this.giftcert = giftcert;
		this.amt = amt;
	}
	
	public void processSales() {
		if(!giftcert) {
			System.out.println("You do not have a gift certificate, you have to pay the amount "+ amt);
		}
		else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the gift certificate value");
			float certVal = scanner.nextFloat();
			if(qty<=0) {
				System.out.println("There are no items in the cart");
			}
			else if(qty>1) {
				System.out.println("Only one item can be purchased with gift certificate");
			}
			else {
				if(amt>certVal) {
					System.out.println("Please pay the balance amount "+(amt-certVal));
				}
				else {
					System.out.println("Thank you for your purchase, the remaining amount will not be refunded");
				}
			}
		}
	}

}
