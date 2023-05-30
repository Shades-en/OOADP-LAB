package facade;

public class facadePOS {
	Item item;
	Sports200Sales sales;
	public facadePOS(boolean g, float amt) {
		// TODO Auto-generated constructor stub
		item = new Item();
		sales = new Sports200Sales(item.getTypeCount(), amt, g);
	}
	
	public void displayItems() {
		item.showItems();
	}
	
	public void getSales() {
		sales.processSales();
	}

}
