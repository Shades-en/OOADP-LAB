package strategy;

public class FCDiscount implements Discount {

	@Override
	public float getDiscount(float amt) {
		// TODO Auto-generated method stub
		return amt*0.15f;
	}

}
