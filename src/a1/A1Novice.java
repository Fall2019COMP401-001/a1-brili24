package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalCustomers = scan.nextInt();
		
		for (int i=0; i<=totalCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int numberOfItems = scan.nextInt();
			
			int numberOfEachItem = scan.nextInt();
			String itemName = scan.next();
			double total = scan.nextDouble();
			
			for (int j=0; j<=numberOfItems; j++) {
				total = total + scan.nextDouble();
			}
		scan.close();
		System.out.println(firstName + lastName + ": " + total);
		}
	}
}
