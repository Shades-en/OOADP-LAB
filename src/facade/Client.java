package facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		facadePOS pos = new facadePOS(false, 300);
		pos.displayItems();
		pos.getSales();
		
		facadePOS pos2 = new facadePOS(true, 200);
		pos2.displayItems();
		pos2.getSales();
	}

}
