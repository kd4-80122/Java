package assignment1;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		int quantity;
		int choice;
		double bill=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("0.Exit");
		System.out.println("***********");
		System.out.println("1.Dosa");
		System.out.println("2.Samosa");
		System.out.println("3.Idli");
		System.out.println("4.Misal");
		System.out.println("5.Pav Bhaji");
		System.out.println("6.Vadapav");
		System.out.println("7.Pattis");
		System.out.println("8.Udid vada");
		System.out.println("9.Mendu vada");
		System.out.println("10.Generate Bill");
		System.out.println("***********");
		System.out.println("Enter your Order from menu :");
		
		choice=sc.nextInt();
	
		while(choice!=0)
		{
		switch(choice)
		{	
		case 1:
			System.out.println("Enter quantity of your order :");
			quantity = sc.nextInt();
			System.out.println("you Ordered Dosa..");
			bill = quantity * 30;
			break;
		
			
		case 2:
			System.out.println("you Ordered Samosa..");
			System.out.println("Enter quantity of your order :");
			quantity = sc.nextInt();
			bill = quantity * 15;
			break;
			
		case 3:
			System.out.println("you Ordered Idli..");
			System.out.println("Enter quantity of your order :");
			quantity = sc.nextInt();
			bill = quantity * 30;
			break;
			
		case 4:
			System.out.println("you Ordered Misal..");
			System.out.println("Enter quantity of your order :");
			quantity = sc.nextInt();
			bill = quantity * 50;
			break;
			
		case 5:
			System.out.println("you Ordered Pav Bhaji..");
			System.out.println("Enter quantity of your order :");
			quantity = sc.nextInt();
			bill = quantity * 50;
			break;
			
		case 6:
			System.out.println("you Ordered Vadapav..");
			System.out.println("Enter quantity of your order :");
			quantity = sc.nextInt();
			bill = quantity * 15;
			break;
			
		case 7:
			System.out.println("you Ordered Pattis..");
			System.out.println("Enter quantity of your order :");
			quantity = sc.nextInt();
			bill = quantity * 15;
			break;
			
		case 8:
			System.out.println("you Ordered Udid vada..");
			System.out.println("Enter quantity of your order :");
			quantity = sc.nextInt();
			bill = quantity * 30;
			break;
			
		case 9:
			System.out.println("you Ordered Mendu vada..");
			System.out.println("Enter quantity of your order :");
			quantity = sc.nextInt();
			bill = quantity * 30;
			break;
			
		case 10:
			System.out.println("your bill is :"+bill);
			break;
			
		default:
			System.out.println("Wrong choice..");
			System.out.println("Please Enter your valid Order :");
			break;
			
	}
        System.out.println("Enter your choice :");
		
		choice=sc.nextInt();

	}
		System.out.println("Thanks for Visiting.....");
}
}