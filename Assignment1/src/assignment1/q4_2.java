package assignment1;
import java.util.Scanner;
   public class q4_2 {
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();
		        scanner.close();

		        for (int i = 1; i <= rows; i++) {
		            
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(" ");
		            }

		           
		            for (int k = 1; k <= 2*i-1; k++) {
		                System.out.print("*");
		            }

		            
		            System.out.println();
		        }
		        rows = rows-1;
		        for(int i=1;i<=rows;i++) 
		        {
		        	for(int j=1;j<=i;j++)
		        	{
		        		System.out.print(" ");
		        	}
		        	for(int k=1;k<=2*(rows-i)+1;k++) {
		        	
		        		System.out.print("*");
		        	}
		        		System.out.println();
		        	    
		        	}
		        }
		        
		    }
		

	

