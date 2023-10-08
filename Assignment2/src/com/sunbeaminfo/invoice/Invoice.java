package com.sunbeaminfo.invoice;

import java.util.Scanner;

public class Invoice {
	String partNumber;
	String partDesc;
	int qty;
	double price;

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if(this.qty>0)
		this.qty = qty;
		else
			this.qty=0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(this.price>0)
		this.price = price;
		else
			this.price =0;
	}

	public Invoice() {
		this("", "", 0, 0);
	}

	public Invoice(String partNumber, String partDesc, int qty, double price) {

		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.qty = qty;
		this.price = price;
	}

	public void acceptInvoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a part num =");
		this.partNumber = sc.next();
		System.out.println("Enter a part Desc =");
		this.partDesc = sc.next();
		System.out.println("Enter a qty =");
		this.qty = sc.nextInt();
		if (this.qty < 0)
			this.qty = 0;


		System.out.println("Enter a price =");
		this.price = sc.nextDouble();
		if (this.price < 0)
			this.qty = 0;
	}

	public void displayInvoice() {

		System.out.println("part num =" + this.partNumber);

		System.out.println("part Desc =" + this.partDesc);

		System.out.println("a qty =" + this.qty);

		System.out.println("price =" + this.price);

	}

	double calculateAmount() {
		double amount = qty * price;
		return amount;
	}
//	public static void main(String args[]) {
//		Invoice i1=new Invoice();
//		i1.acceptInvoice();
//		i1.displayInvoice();
//		System.out.println("Calculate Amount"+i1.calculateAmount());
//		
//	}

}
