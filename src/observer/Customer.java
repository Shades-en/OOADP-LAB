package observer;

public class Customer extends Observer {
	
	String name;
	float discount;
	Store store;

	public Customer(String name, Store s) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.store = s;
		store.register(this);
	}

	@Override
	public void update(float d) {
		// TODO Auto-generated method stub
		this.discount =d;
		System.out.println(this.name+" will get a discount of "+d+" from "+this.store.name);
	}
	
	public String toString() {
		return this.name;
	}

}
