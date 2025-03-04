package com.nt.methods;



public class Bank {

	static int currentBalance=1000;
	
	public static void main(String[] args) {
		
		greetCustomer();
		Bank bk=new Bank();
		bk.deposit(500);		//IMP:: We cannot access the non static methods in static method
		withdrawn(200);
		int bkcurr=bk.getCurrentBalance();  //We cannot access the non static methods in static method
		System.out.println("Current Balance is: "+bkcurr);
		
	}
	
	public static void greetCustomer() {
		System.out.println("Hello, Welcome to the Thula's Bank.");
	}
	
	public void deposit(int amount) {
		System.out.println("Before deposit amount is: "+currentBalance);
		currentBalance=currentBalance+amount;
		System.out.println("After deposit amount is: "+currentBalance);
	}
	
	public static  void withdrawn(int amount) {
		System.out.println("Before Withdraw amount is: "+currentBalance);
		currentBalance=currentBalance-amount;
		System.out.println("After Withrdraw amount is: "+currentBalance);
	}
	
	public int getCurrentBalance() {
		return currentBalance;
	}
}
