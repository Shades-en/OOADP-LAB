package strategy;

public class SCDiscount implements Discount {

	@Override
	public float getDiscount(float amt) {
		// TODO Auto-generated method stub
		return amt*0.1f;
	}

}
