package com.sunbeaminfo.invoice;

public class TestInvoice {

	public static void main(String[] args) {
		
		Invoice i = new Invoice();
		i.acceptInvoice();
		i.displayInvoice();
		i.calculateAmount();
	/*    Invoice i=new Invoice("101","abc",10,1.2);
		i.displayInvoice(); */
		System.out.println("Calculate Amount="+i.calculateAmount()); 

	}

}
