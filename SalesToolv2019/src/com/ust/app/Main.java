package com.ust.app;

public class Main {
	
	public static void main(String args[]){
		
		SalesData objSalesData = new SalesData();
		System.out.println("Welcome to sales App");
		displayGreeting();
		objSalesData.display();
	}

	private static void displayGreeting(){
		System.out.println("Dislpaying Sales");
	}
}
