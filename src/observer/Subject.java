package observer;

public abstract class Subject {
	public abstract void register(Observer o);
	public abstract void unregister(Observer o);
	public abstract void notifyObservers();
}
