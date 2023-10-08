package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		Point2D[] points = new Point2D[sc.nextInt()];
		// points = new Point2D[] { new Point2D(4, 4), new Point2D(2, 2) };//ctor

//		for (Point2D p : points) {
//			p = new Point2D();
//			p.acceptPoint();
//		}//solve this doubts
//		for (Point2D p : points)
//
//			p.displayPoint();
////		}//dynamic array using for each

		for (int i = 0; i < points.length; i++) {
			points[i] = new Point2D();
			System.out.println("Enter the details of x & y co-ordinates at index points[" + i + "]");
			points[i].acceptPoint();
		}

		boolean exit = false;
		int choice;

		while (!exit) {
			System.out.println("1)Display details of a specific point");
			System.out.println("2) Display x, y co-ordinates of all points");
			System.out.println("3) User i/p : 2 indices for the points , validate the indices");
			System.out.println("100.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter the index ");
				int index = sc.nextInt();
				for (int i = 0; i < points.length; i++) {
					if (index == i) {
						points[index].displayPoint();
						break;
					}
				}
				break;
			case 2:
				for (Point2D p : points)
					p.displayPoint();
				break;

			case 3:
				System.out.println("Enter index of strt point");
				int start_index = sc.nextInt();
				System.out.println("Enter index of end point");
				int end_index = sc.nextInt();
				if (start_index >= 0 && start_index <= points.length - 1 && end_index >= 0
						&& end_index <= points.length - 1) {
					if (!points[start_index].isEqual(points[end_index])) {
						System.out.println("Distance b/w two points = "
								+ points[start_index].calculateDistance(points[end_index]));
					}
				} else {

					System.out.println("Invalid index");
				}

				break;
			case 100:
				exit = true;
				break;

			}
		}
		System.out.println("Thanks for using calculator....");

	}
}
