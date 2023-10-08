package com.app.car;

import java.util.Scanner;

public class Carinfo {

	double milesDriven ;
	double costPerGallon;
	double milesPerGallon;
	double parkingFees;
	double tolls;
	
	public Carinfo() {
		
	}
	public Carinfo(double  milesDriven, double costPerGallon, double milesPerGallon, double parkingFees, double tolls) {

		this.milesDriven = milesDriven;
		this.costPerGallon = costPerGallon;
		this.milesPerGallon = milesPerGallon;
		this.parkingFees = parkingFees;
		this.tolls = tolls;
	}

	double dailydrivingCost() {
		
		return (milesDriven/milesPerGallon)*costPerGallon +parkingFees+tolls;
	
	}

	public double getmilesDriven() {
		return milesDriven;
	}

	public void setmilesDriven(double milesDriven) {
		this.milesDriven = milesDriven;
	}
	
	public void accept() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter milesDriven");
		milesDriven=sc.nextDouble();
		System.out.println("Enter costPerGallon");
		costPerGallon=sc.nextDouble();
		System.out.println("Enter milesPerGallon");
		milesPerGallon=sc.nextDouble();
		System.out.println("Enter parkingFees");
		parkingFees=sc.nextDouble();		
		System.out.println("Enter tolls");
		tolls=sc.nextDouble();		

	}
	public void display() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("totalMilesPerday="+milesDriven);

		System.out.println("costofGallon="+costPerGallon);

		System.out.println("avgofGallon="+milesPerGallon);
	
		System.out.println(" parkingFees="+parkingFees);
		
		System.out.println("tolls="+tolls);
			
	}
	
public static void main(String[] args) {
	
	//Carinfo c1= new Carinfo(50,10,9,10,5);
	Carinfo c2=new Carinfo();
	c2.accept();
	c2.display();

		System.out.println("your daily driving cost= "+c2.dailydrivingCost());
	
}	
}
