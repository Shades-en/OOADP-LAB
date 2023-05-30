package bridge;

public class Discount2 implements Discount {

	@Override
	public float getDiscount(float amt) {
		// TODO Auto-generated method stub
		return 0.25f*amt;
	}

}
