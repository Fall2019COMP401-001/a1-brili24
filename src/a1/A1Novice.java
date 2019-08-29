package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// declare total number of customers
		int totalCustomers = scan.nextInt();
		
		// initial loop for total customers
		for (int i=0; i<totalCustomers; i++) {
			
			// store first name of customer
			String firstName = scan.next();
			
			// get first initial
			char firstInitial = firstName.charAt(0);
			
			// store last name of customer
			String lastName = scan.next();
			
			// declare number of items bought by customer
			int numberOfItems = scan.nextInt();
			
			double total = 0;
			
			// second loop for number of items
			for (int j=0; j<numberOfItems; j++) {
				
				// declare number of each item bought
				int numberOfEachItem = scan.nextInt();
				
				// declare item name, not really used
				String itemName = scan.next();
				
				// declare price of item
				double price = scan.nextDouble();
				
				// add and multiply price to the total cost
				total = total + price * numberOfEachItem;
			}
		// to two decimal places
		String totalPrice = String.format("%.2f", total);
		
		// print output	
		System.out.println(firstInitial + ". " + lastName + ": " + totalPrice);
		}
		scan.close();
	}
}
