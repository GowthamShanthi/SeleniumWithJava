package ProgramWorkouts;

import java.util.Scanner;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub3
 System.out.println("Enter a string ");
		 
String inpstring = "Welcome @$%&&(**";

String updtdstring = inpstring.replaceAll("[^a-zA-z0-9]", "");


	
	System.out.println(updtdstring);
	
		
		

	}

}
