package com.app.vehicles;

public class TestVehicle {
	public static void main(String[] args) throws Exception {
		Vehicles v1 = new Vehicles(1, "Red", 100);
		//Vehicles v2=v1;
		Vehicles v3 = new Vehicles(1, "yellow", 200);
//		System.out.println("v1 color ="+v1.color);
//		System.out.println("v1 color ="+v1.price);
	       Vehicles v2 = (Vehicles) v1.clone();
//		v1.color = "Yellow";
//		v1.price = 200;
//		System.out.println("v2 color ="+v2.color);
//		System.out.println("v2 color ="+v2.price);
//		if (v1.equals(v2))
//			System.out.println("Equals");
//		else
//			System.out.println("Not Equals");
		if(v1.equals(v3))
			System.out.println("Same");
		else
		System.out.println("Different");
		
			
	}

}
