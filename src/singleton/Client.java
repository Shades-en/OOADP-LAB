package singleton;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Open browser");
			System.out.println("2. Open Url");
			System.out.println("3. Get History");
			System.out.println("4. exit");
			System.out.println("Enter choice");
			int choice = scanner.nextInt();
			if(choice==1) {
				Browser browser = Browser.getInstance();
			}
			else if(choice==2) {
				System.out.println("Enter URL");
				String url = scanner.next();
				Browser.getInstance().addUrl(url);
			}
			else if(choice==3) {
				Browser.getInstance().getHistory();
			}
			else {
				break;
			}
		}
	}

}
