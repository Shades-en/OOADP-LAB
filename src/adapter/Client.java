package adapter;

public class Client {
	public static void main(String[] args) {
		CalcTax ma = new MauriAdapter();
		Item item = new Item("Bat", 200, 2700.0f, ma);
		
		item.display();
		
		item.setTax(new GST());
		item.display();
	}
}
