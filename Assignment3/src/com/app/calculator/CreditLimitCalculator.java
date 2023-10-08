package com.app.calculator;

public class CreditLimitCalculator {

	
		public static void main(String[] args) {
			
//			Customer cust1 = new Customer(101,10000,2000,5000,200000);
			Customer cust2 = new Customer();
			cust2.accept();
			cust2.display();
			if(cust2.getCreditLimit()>cust2.calaculateBalance()) {
				System.out.println("New Balance= "+cust2.calaculateBalance());
			}
			else {
				System.out.println("Credit limit exceeded");
			}

		}

	

}
