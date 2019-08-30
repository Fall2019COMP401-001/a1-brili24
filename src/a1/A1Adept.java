package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// declare integer count of items in store
		int countOfStoreItems = scan.nextInt();
		
		// initialize array of store item names
		String[] storeItemNames = new String[countOfStoreItems];
		
		// initialize array of price of store items
		double[] storeItemPrices = new double[countOfStoreItems];
		
		// initial loop for store items
		for(int i=0; i<countOfStoreItems; i++) {
			// assign store item name in array
			storeItemNames[i] = scan.next();
		
			// assign store item price in second array
			storeItemPrices[i] = scan.nextDouble();
		}
		// declare integer count of customers
		int countOfCustomers = scan.nextInt();
		
		// initialize array of names of customers
		String[] namesOfCustomers = new String[countOfCustomers];
		
		// declare array of amounts for total cost
		double[] amounts = new double[countOfCustomers];
		
		// second loop of customers
		for (int j=0; j<countOfCustomers; j++) {
			// declare first name of customer
			String firstName = scan.next();
			
			// declare last name of customer
			String lastName = scan.next();
			
			namesOfCustomers[j] = firstName + " " + lastName;
			
			// declare integer count of items bought by customer
			int countOfItems = scan.nextInt();
			
			// third loop for number of each item
			for (int k=0; k<countOfItems; k++) {
				// declare quantity of each item bought
				int quantityOfItem = scan.nextInt();
				
				// declare name of item
				String nameOfItem = scan.next();
				
				// fourth loop for matching name of item to store item name
				for (int a=0; a<countOfStoreItems; a++) {
					if (nameOfItem.equals(storeItemNames[a])) {
					// put amount spent for each customer
					amounts[j] += storeItemPrices[a] * quantityOfItem;
					}	
				}
			}
		}
	// call methods to find output
	double biggestSpent = findBiggest(amounts);
	double smallestSpent= findSmallest(amounts);
	double averageSpent = findAverage(amounts);
	
	// to 2 decimals
	String biggestSpentAmount = String.format("%.2f", biggestSpent);
	String smallestSpentAmount = String.format("%.2f", smallestSpent);
	String averageSpentAmount = String.format("%.2f", averageSpent);
	
	// declare biggest and smallest spender
	String biggestSpender = "";
	String smallestSpender = "";
	
	// get name of spenders
	for (int b=0; b<amounts.length; b++) {
		if (biggestSpent == (amounts[b])) {
			biggestSpender = namesOfCustomers[b];
		}
		if (smallestSpent == amounts[b]) {
			smallestSpender = namesOfCustomers[b];
		}
	}
	// print output
	System.out.println("Biggest: " + biggestSpender + " (" + biggestSpentAmount + ")");
	System.out.println("Smallest: " + smallestSpender + " (" + smallestSpentAmount + ")");
	System.out.println("Average: " + averageSpentAmount);
	
	scan.close();
	}
	// method for biggest spender
	static double findBiggest(double[] amounts) {
		// initialize current maximum to first value in array
		double currentBiggest = amounts[0];
		
		// compare each value in array with current minimum and replace if bigger
		for (int x=1; x<amounts.length; x++) {
			if (amounts[x] > currentBiggest) {
				currentBiggest = amounts[x];
			}
		}
		return currentBiggest;
	}
		
	// method for smallest spender
	static double findSmallest(double[] amounts) {
		// initialize current minimum to first value in array
		double currentSmallest = amounts[0];
				
		// compare each value in array with current maximum and replace if smaller
		for (int y=1; y<amounts.length; y++) {
			if (amounts[y] < currentSmallest) {
				currentSmallest = amounts[y];
			}
		}
		return currentSmallest;
	}
		
	// method for average
	static double findAverage(double[] amounts) {
		// get sum of all values in array
		double sum = 0;
		for (int z=0; z<amounts.length; z++) {
			sum += amounts[z];
		}
		double averageAmount = sum / amounts.length;
		return averageAmount;
	}
}
