package bridge;

public class Discount4 implements Discount {

	@Override
	public float getDiscount(float amt) {
		// TODO Auto-generated method stub
		return 0.15f*amt;
	}

}