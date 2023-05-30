package bridge;

public class Discount1 implements Discount {

	@Override
	public float getDiscount(float amt) {
		// TODO Auto-generated method stub
		return 0.3f*amt;
	}

}
