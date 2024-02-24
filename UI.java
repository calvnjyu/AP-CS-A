import java.util.*;

public class UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hi, valued customer. Welcome to Bertucci's online ordering app. What is your name?");
		
		String name = in.nextLine();
		
		System.out.println("Understood. Are you ordering for pickup or delivery? 1) Pickup 2) Delivery");
		
		int tf = in.nextInt();
		if(tf != 1 && tf != 2) {
    		System.out.println("ERROR... shutting down. Please reboot this application if you wish to continue ordering.");
		}
		
		System.out.println("What would you like to order? Type 1 to order a drink; Type 2 to order a main course.");
		
    	int guess = in.nextInt();
    	
    	if(guess == 1) {
    		System.out.println("1) Coca cola 2) Ice water 3) Lemonade 4) Sprite");
    		
        	int guess1 = in.nextInt();
        	
        	if(guess1 != 1 && guess1 != 2 && guess1 != 3 && guess1 != 4) {
        		System.out.println("ERROR... shutting down. Please reboot this application if you wish to continue ordering.");
        		return;
        	}
        	
    		gotit(name, tf);
    	} else if(guess == 2) {
    		System.out.println("1) Pizza 2) Lasagna 3) Pasta 4) Garlic bread");
    		
        	int guess1 = in.nextInt();

    		if(guess1 != 1 && guess1 != 2 && guess1 != 3 && guess1 != 4) {
        		System.out.println("ERROR... shutting down. Please reboot this application if you wish to continue ordering.");
        		return;
        	}
    		
    		gotit(name, tf);
    	} else {
    		System.out.println("ERROR... shutting down. Please reboot this application if you wish to continue ordering.");
    	}
	}
	
	public static void gotit(String name, int delivery) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Understood. Thank you " + name + " for ordering from Bertucci's! Please enter your credit card number below.");
		int x = in.nextInt();
		
		if(delivery == 1) {
			System.out.println("Understood. Your order will be ready in 10 minutes for pickup!");
		} else {
        	System.out.println("Understood. Your order is on its way. ");
        	
        	
		}
	}

}
