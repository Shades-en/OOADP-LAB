package adapter;

public class MauriAdapter implements CalcTax {
	MauriTax mTax = new MauriTax();
	@Override
	public float calculateTax(int qty, float amt) {
		return mTax.calulateTax(qty, amt, 0.3);
	}
}
