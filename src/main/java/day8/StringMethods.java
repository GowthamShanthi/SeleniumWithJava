package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String s = "Welcome";
		
		String s = new String("Welcome");
		
		
		System.out.println(s);
		
		//length() method
		
		int lenght = s.length();
		
		System.out.println("The length of the string is "+lenght);
		

		//concat() - join string
		
		String s1 =  "Welcome";
		String s2 =  "to java";
		
		String s3 = "Programming ";
		
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2).concat(s3));
		
		
		//trim() - remove spaces right ad left side 
		
		s = "    welcome   ";
		
		System.out.println("Before trimming "+s.length());
		
 
			String s4 = s.trim();
		
		
		System.out.println("After trimming "+s4.length());
		
		
		
	//CharAt() - retuns a character from te string, based on index
		
		//index starts from 0
		
System.out.println("The fourth character in the string is "+s1.charAt(3));
		
		
//Contains () - reyturns true/false

//check a string is part of the main string

System.out.println(s1.contains("Wel")); //true
System.out.println(s1.contains("Come"));//false - as the string is case sensitive 



//equals() - returns true oe false 

System.out.println(s1.equals("Welcome")); // true
System.out.println(s1.equals("WELCOME")); // false
System.out.println(s1.equalsIgnoreCase("WELCOME")); // True



//replace() - replace single character/sequence of characters in a string 


s= " Welcome to selenium java python automation ";

System.out.println(s.replace('e', 'a'));

System.out.println(s.replaceAll("Welcome", "Namachivaya"));
		
		
//Substring() - Extract substring from main string 


System.out.println(s1.substring(2, 4));



//touppercase(), tolowercase();

System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());

//Split() - divide the string to multiple parts, based on the delimeter 

s = "abc@xyz";



 
String[] sparray=    s.split("@");

System.out.println(sparray[0]);
System.out.println(sparray[1 ]);

// Replace method

String amount = "$15,20,55";

 String amount1 =   amount.replace("$","").replace(",", "");

System.out.println(amount1);


s = "abc,123@xyz";  //Output abc,123,,xyz


System.out.println(s.split(",")[0]);

 
System.out.println(s.split(",")[1].split("@")[0]);


System.out.println(s.split(",")[1].split("@")[1]);


String consolidatedtsing  = s.split(",")[0];

String secondstring = s.split(",")[1].split("@")[0];

String thirdstring = s.split(",")[1].split("@")[1];


System.out.println(consolidatedtsing+secondstring+thirdstring);


	
	}

}
