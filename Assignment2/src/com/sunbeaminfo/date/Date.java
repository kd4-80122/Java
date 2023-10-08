package com.sunbeaminfo.date;

import java.util.Scanner;

public class Date {
int month;
int day;
int year;
public Date(int month, int day, int year) {

	this.month = month;
	this.day = day;
	this.year = year;
}
public Date() {
	this(0,0,0);
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void acceptDate() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a day");
	this.day=sc.nextInt();
	System.out.println("Enter a month");
	this.month=sc.nextInt();
	System.out.println("Enter a year");
	this.year=sc.nextInt();
	
}
public void displayDate() {
	System.out.println(this.day+"/"+this.month+"/"+this.year);
}

//public static void main(String[] args) {
//	
//}
}