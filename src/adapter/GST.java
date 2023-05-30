package adapter;

public class GST implements CalcTax {
	public float calculateTax(int qty, float amt) {
		return qty*amt*0.15f;
	}
}
