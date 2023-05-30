package facade;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Item {
	HashMap<String, Integer> items;
	int type;
	public Item() {
		// TODO Auto-generated constructor stub
		items= new HashMap<>();
		purchaseItems();
	}
	
	private void purchaseItems() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of item types");
		this.type = scanner.nextInt();
		for(int i=0;i<type;i++) {
			System.out.println("Enter the name of item");
			String name = scanner.next();
			System.out.println("Enter the quantity of the item");
			int qty = scanner.nextInt();
			items.put(name, qty);
		}
	}
	
	public void showItems() {
		for(Map.Entry<String, Integer> item: items.entrySet()) {
			System.out.println(item.getKey()+" : "+item.getValue());
		}
	}
	
	public int getTypeCount() {
		return this.type;
	}

}
