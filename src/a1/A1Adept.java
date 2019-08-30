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
		
		// second loop of customers
		for (int j=0; j<countOfCustomers; j++) {
			// declare first name of customer
			String firstName = scan.next();
			
			// declare last name of customer
			String lastName = scan.next();
			
			namesOfCustomers[j] = firstName + " " + lastName;
			
			// declare integer count of items bought by customer
			int countOfItems = scan.nextInt();
			
			// initialize amount for total cost
			double[] amounts = new double[countOfCustomers];
				
			// third loop for number of each item
			for (int k=0; k<countOfItems; k++) {
				// declare quantity of each item bought
				int quantityOfItem = scan.nextInt();
				
				// declare name of item
				String nameOfItem = scan.next();
				
				// reference array of store item names 
				if (nameOfItem == storeItemNames[k]) {
					// add and multiply amount for the cost for each customer
					amounts[k] = storeItemPrices[k] * quantityOfItem;
				}
			}
		// call methods to find output
		String biggestSpent = findBiggest(amounts);
		String smallestSpent= findSmallest(amounts);
		String averageSpent = findAverage(amounts);
		
		// print output
		System.out.println("Biggest: " + "(" + biggestSpent + ")");
		System.out.println("Smallest: " + "(" + smallestSpent + ")");
		System.out.println("Average: " + averageSpent);
		}
	scan.close();
	}
	// method for biggest spender
	static String findBiggest(double[] amounts) {
		// initialize current maximum to first value in array
		double currentBiggest = amounts[0];
		
		// compare each value in array with current minimum and replace if bigger
		for (int x=1; x<amounts.length; x++) {
			if (amounts[x] > currentBiggest) {
				currentBiggest = amounts[x];
			}
		}
		String biggest = String.format("%.2f", currentBiggest);
		return biggest;
	}
		
	// method for smallest spender
	static String findSmallest(double[] amounts) {
		// initialize current minimum to first value in array
		double currentSmallest = amounts[0];
				
		// compare each value in array with current maximum and replace if smaller
		for (int y=1; y<amounts.length; y++) {
			if (amounts[y] < currentSmallest) {
				currentSmallest = amounts[y];
			}
		}
		String smallest = String.format("%.2f", currentSmallest);
		return smallest;
	}
		
	// method for average
	static String findAverage(double[] amounts) {
		// get sum of all values in array
		double sum = 0;
		for (int z=0; z<amounts.length; z++) {
			sum += amounts[z];
		}
		double averageAmount = sum / amounts.length;
		String average = String.format("%.2f", averageAmount);
		return average;
	}
}
