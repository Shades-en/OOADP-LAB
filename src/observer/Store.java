package observer;

import java.util.ArrayList;

public class Store extends Subject {
	String name;
	float discount;
	ArrayList<Observer> customers;  

	public Store(float discount, String name) {
		// TODO Auto-generated constructor stub
		this.discount = discount;
		this.name = name;
		customers = new ArrayList<>();
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		customers.add(o);
		System.out.println("Customer "+o+" will now be notified about any updates from "+this.name);
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		try {
			customers.remove(o);
			System.out.println("Customer "+o+" will not be notified about updates from "+this.name);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("There is no such customer"+o+" susbscribing to this store");
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o: customers) {
			o.update(this.discount);
		}
	}
	
	public void setDiscount(float discount) {
		System.out.println(this.name +" has Updated thier discount to "+ discount);
		this.discount = discount;
		notifyObservers();
	}

}
