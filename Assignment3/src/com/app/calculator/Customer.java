package com.app.calculator;

import java.util.Scanner;

public class Customer {
	
	int  accountNo;
	int  balanceBegin;
	int  totalCharges;//Charges
	int  totalCredit;//Credits
	int  creditLimit;
	
	public Customer() {
		this(0,0,0,0,10000);
	}
	public Customer(int accountNo, int balanceBegin, int totalCharges, int totalCredit, int creditLimit) {
	
		this.accountNo = accountNo;
		this.balanceBegin = balanceBegin;
		this.totalCharges = totalCharges;
		this.totalCredit = totalCredit;
		this.creditLimit = creditLimit;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public double calaculateBalance() {
		
		return balanceBegin+totalCharges-totalCredit;
	}

	 public void accept() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a accountNo");
		 this.accountNo=sc.nextInt();
		 System.out.println("Enter a balanceBegin");
		 this.balanceBegin=sc.nextInt();
		 System.out.println("Enter a totalCharges");
		 this.totalCharges=sc.nextInt();
		 System.out.println("Enter a totalCredit");
		 this.totalCredit=sc.nextInt();
		 System.out.println("Enter a creditLimit");
		 this.creditLimit=sc.nextInt();
		 
		 
	 }
	 public void display() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("accountNo= "+this.accountNo);
		
		 System.out.println("balanceBegin= "+this.balanceBegin);
		
		 System.out.println("totalCharges= "+this.totalCharges);
	
		 System.out.println("totalCredit= "+this.totalCredit);
		 
		 System.out.println("creditLimit= "+this.creditLimit);
		
		 
		 
	 }
//	public static void main(String[] args) {
//	
////		Customer cust1 = new Customer(101,10000,2000,5000,200000);
//		Customer cust2 = new Customer();
//		cust2.accept();
//		cust2.display();
//		if(cust2.getCreditLimit()>cust2.calaculateBalance()) {
//			System.out.println("New Balance= "+cust2.calaculateBalance());
//		}
//		else {
//			System.out.println("Credit limit exceeded");
//		}
//
//	}
	

}
