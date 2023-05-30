package adapter;

public class MauriTax {
	public float calulateTax(int qty, float amt, double margin) {
		return qty*amt*0.1f + (float)margin;
	}
}
