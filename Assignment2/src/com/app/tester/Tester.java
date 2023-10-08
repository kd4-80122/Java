package com.app.tester;

import com.app.geometry.Point2D;

public class Tester {

	public static void main(String[] args) {
		 Point2D p1 =new Point2D();
		 p1.acceptPoint();
		 p1.displayPoint();	 
//		System.out.println(p.getDetails()());
		 Point2D p2 =new Point2D();
		 p2.acceptPoint();
		 p2.displayPoint();
		 
		 if(p1.isEqual(p2)) {
			 System.out.println("Equal");
		 }
		 else {
			 System.out.println("Not Equal"); 
			   System.out.println(p1.calculateDistance(p2));
		 }

}
}