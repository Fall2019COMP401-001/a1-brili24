package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// declare integer count of items in store
		int countOfStoreItems = scan.nextInt();
				
		// initialize array of store item names
		String[] storeItemNames = new String[countOfStoreItems];
				
		// initialize array of price of store items
		double[] storeItemPrices = new double[countOfStoreItems];
		
		// initialize array for final number of customers who bought each item
		int[] finalNumberCustomers = new int[countOfStoreItems];
		
		// initialize array for final number of each item bought
		int[] finalNumberBought = new int[countOfStoreItems];
				
		// initial loop for store items
		for (int i = 0; i < countOfStoreItems; i++) {
			// assign store item name in array
			storeItemNames[i] = scan.next();

			// assign store item price in second array
			storeItemPrices[i] = scan.nextDouble();
		}
		// declare integer count of customers
		int countOfCustomers = scan.nextInt();

		// initialize array of names of customers
		String[] namesOfCustomers = new String[countOfCustomers];
		
		// initialize array of count of items bought by customers
		int[] countOfItems = new int[countOfCustomers];
		
		// initialize boolean array of items bought
		boolean[] itemBought = new boolean[countOfStoreItems];
			
		// second loop of customers
		for (int j = 0; j < countOfCustomers; j++) {
			// declare first name of customer
			String firstName = scan.next();

			// declare last name of customer
			String lastName = scan.next();

			namesOfCustomers[j] = firstName + " " + lastName;

			// declare integer count of items bought by customer
			countOfItems[j] = scan.nextInt();
			
			// third loop for number of each item
			for (int k = 0; k < countOfItems[j]; k++) {
				// declare quantity of each item bought
				int quantityOfItem = scan.nextInt();
				
				// declare name of item
				String nameOfItem = scan.next();
				
				// fourth loop for matching name of item to store item name
				for (int a = 0; a < countOfStoreItems; a++) {
					if (nameOfItem.equals(storeItemNames[a])) {
						itemBought[a] = true;
						finalNumberBought[a] = finalNumberBought[a] + quantityOfItem;
					}
				}
			}
			// fourth loop for counting number of customers who bought each item
			for (int b = 0; b<storeItemNames.length; b++) {
				if (itemBought[b] == true) {
					finalNumberCustomers[b]++;
				}
			}
		}
		// print output in for loop
		for (int c = 0; c<countOfStoreItems; c++) {
			if (finalNumberBought[c] == 0) {
				System.out.println("No customers bought " + storeItemNames[c]);
			} else {
				System.out.println(finalNumberCustomers[c] + " customers bought " + finalNumberBought[c] + " " + storeItemNames[c]);
			}
		}
	scan.close();
	}
}
