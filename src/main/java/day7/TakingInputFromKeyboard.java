package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Getting int value form keyboard 
		Scanner sc = new Scanner(System.in);
				
				
		System.out.println("Enter the value for a");
		
		int a = sc.nextInt();
		
		System.out.println("Enter the value for b");
		
		int b = sc.nextInt();
		
		
		System.out.println("Thea value is "+a);
		System.out.println("Thea value is "+b);
		
		
		
//Getting string value from user 
		
		System.out.println("Enter a name ");
		
		String name1 = sc.next();
		
		System.out.println("The user entered name is"+name1);
		
		
// Getting decimal value from user 
		
		System.out.println("Enter a decimal number ");
		
		double d1 = sc.nextDouble();
		
		System.out.println("The usre entered decimal number is"+d1);
		
		
		
		
	}

}
