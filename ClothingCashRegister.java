import java.util.*;
import java.io.*;

public class ClothingCashRegister {
	public static void main(String[] args) {
		int itemPrice;
		itemPrice = 1;
		double priceTotal;
		priceTotal = 0;
		int itemCount = 0;
		Scanner in = new Scanner(System.in);
		String logo = "xxxxx";

		for (int i = 0; i < logo.length(); i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(logo.charAt(i));
			}
			System.out.println();
		}

		System.out.println("Welcome to triangle retail! Please enter the prices of your items--positive integers only!");
		System.out.println("Once you're finished, enter 0 and we will return your sum.");
		System.out.println("To begin, type in your first item.");
		
		while (itemPrice!= 0) {
			itemCount++;
			System.out.println("enter the price of item numer " + itemCount + " please!");
			itemPrice = in.nextInt();
			if(itemPrice == 0) {
				System.out.println("Understood. Proceeding to checkout...");
				break;
			}
			priceTotal += itemPrice;
		}
		
		itemCount--;
		
		if (priceTotal > 175) {
			priceTotal += (priceTotal - 175)*0.625;
		}
		
		double roundOff = Math.round(priceTotal * 100.0) / 100.0;
		System.out.println("Your total is " + roundOff + " for a total of  " + itemCount + " items. ");
		System.out.print("Thanks for shopping at Triangle retail. Come again!");
		in.close();
	}

}