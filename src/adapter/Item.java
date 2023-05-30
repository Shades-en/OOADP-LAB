package adapter;

public class Item {
	String name;
	int qty;
	float amt;
	CalcTax tax;
	
	public Item(String name, int qty, float amt, CalcTax tax) {
		this.name = name;
		this.qty = qty;
		this.amt = amt;
		this.tax = tax;
	}
	
	public void setTax(CalcTax tax) {
		this.tax = tax;
	}
	
	public void display() {
		System.out.println("Name of item is "+ this.name);
		System.out.println("Quantity of item is "+ this.qty);
		float total = this.amt*this.qty;
		System.out.println("Price is "+ total);
		float tax_amt = this.tax.calculateTax(this.qty, this.amt);
		System.out.println("Tax is "+ tax_amt);
		System.out.println("Final amount is "+ (total - tax_amt));
	}
}
