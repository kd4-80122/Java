package assignment1;
import java.util.Scanner;

public class q1 {	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num;
    	System.out.println("java test");
    	
    	System.out.println("Enter Number :");
    	num=sc.nextInt();
    	
    	System.out.println("Binary Equivalent :"+Integer.toBinaryString(num));
        System.out.println("Octal Equivalent :"+Integer.toOctalString(num));
    	System.out.println("Hexadecimal Equivalent :"+Integer.toHexString(num));
        
	}

}
