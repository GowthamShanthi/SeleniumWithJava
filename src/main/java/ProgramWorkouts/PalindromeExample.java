package ProgramWorkouts;

import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Enter a string ");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 
	String originalstr = 	 sc.next();
	
	String rev ="";
	for(int i = originalstr.length()-1;i>=0;i-- ) {
		
		rev = rev + originalstr.charAt(i);
		
		
		
		
	}
	
		
	if(originalstr.equals(rev)) {
		
		
		System.out.println("The entered string is palindrome");
		
		
	}
	else 
	{
		
		System.out.println("The entered string is NOT palindrome");
		
		
	}

	}

}
