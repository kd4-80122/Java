package com.Circle;

public class InvalidDiameter extends Exception {
	private String msg;
	public InvalidDiameter(){
		this.msg= "Diameter shouble be....positive";		
	}	
	public InvalidDiameter(String msg){
	//System.out.println("Diameter shouble be....positive");	
	}
	//@Override
	public String toString() {
		return "InvalidDiameter [msg=" + this.msg+ "]";
	}
}
