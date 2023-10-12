package com.app.vehicles;

import java.util.Objects;

public class Vehicles implements Cloneable{
	//chasisNo : int , color : String , price : double
	private int chasisNo;
	String color;
	double price;
	public Vehicles() {
		this(0,"",0);
	}
	public Vehicles(int chasisNo, String color, double price) {
		//super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
	}
	public int getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
//public	boolean equals(Object obj) {
//		if(obj instanceof Vehicles) {
//			if(((Vehicles) obj).chasisNo==this.chasisNo)
//				return true;
//			return false;
//		}
//             return false;
//}
	@Override
	public int hashCode() {
		return Objects.hash(chasisNo, color, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicles other = (Vehicles) obj;
		return chasisNo == other.chasisNo && Objects.equals(color, other.color)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
}
