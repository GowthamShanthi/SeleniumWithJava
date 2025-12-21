package ProgramWorkouts;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string ");

		Scanner sc = new Scanner(System.in);

		String userstr = sc.nextLine();
		
		
	String[] numofwords = 	userstr.split("\\s");
	
	
	System.out.println("The number of words in the string is "+ numofwords.length);
	
		
		
		

	}

}
