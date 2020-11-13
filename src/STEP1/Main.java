package STEP1;

import java.util.Scanner;
public class Main {

	public static void main(String... args) {
		// FIRST STEP TESTING 
		System.out.println( "*********** WECLOME TO BOOKSTORE *********** \n");
		
		try {
		Scanner Inputuser = new Scanner(System.in);
		System.out.println("Please Enter the Quantity \n ");
		int inputQuantity =Inputuser.nextInt();
		System.out.println("\n Please Enter the UnitPrice ");
		Double inputPrice =Inputuser.nextDouble();
		Inputuser.close();
		Order order =new Order(inputQuantity,inputPrice);	
		System.out.printf(" \n The total price of your order is %.2f \n ",order.calculateTotalPrice());
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("please check your input informations ");
		}; 
		//order.Dislpay();
		
		

	}

}
