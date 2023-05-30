package strategy;

public class SCCutomer extends Customer {
	public SCCutomer(String name) {
		super(name);
		this.d = new SCDiscount();
	}
}
