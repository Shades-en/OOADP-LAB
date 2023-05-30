package singleton;

import java.util.ArrayList;

public class Browser {
	private static Browser browser;
	private ArrayList<String> history = new ArrayList<>();
	private Browser() {
		// TODO Auto-generated constructor stub
	}
	
	public static Browser getInstance() {
		if(browser==null) {
			System.out.println("Browser Opened");
			browser = new Browser();
		}
		return browser;
	}
	
	public void getHistory() {
		System.out.println();
		for(String url: history)
			System.out.println(url);
	}
	
	public void addUrl(String url) {
		history.add(url);
	}
}
