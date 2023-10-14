package com.string;

public class ExceptionLineTooLong extends Exception {
private String msg;
	public ExceptionLineTooLong() {
		//System.out.println("The strings is too long");
		this.msg="The strings is too long";

	}
	@Override
	public String toString() {
		return "ExceptionLineTooLong [msg=" + msg + "]";
	}
	

}
