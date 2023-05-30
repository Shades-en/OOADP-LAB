package strategy;

public class RCDiscount implements Discount {

	@Override
	public float getDiscount(float amt) {
		// TODO Auto-generated method stub
		return amt*0.12f;
	}

}
