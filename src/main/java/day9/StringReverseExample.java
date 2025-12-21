 package day9;

public class StringReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String actual = "Namachivaya";


String rev = "";

 

for(int i=actual.length()-1;i>=0;i--)
{
	
	rev = rev + actual.charAt(i);
}


System.out.println("The reversed string is"+ rev);




//String reverse using string buffer 

StringBuffer buff = new StringBuffer("Namachivaya");


System.out.println(buff.reverse());
	
StringBuilder buildr = new StringBuilder("NamachivayaVaalga");

System.out.println(buildr.reverse());
	

//case 4

String s1 = "abc";
String s2 = new String("abc");

System.out.println(s1==s2); //false
System.out.println(s1.equals(s2));// true 


//String is immutable in java

String s5 = "Namachivaya";

s5.concat("Vaalga Velga");

System.out.println(s5);



//String buffer -- mutable in java

StringBuffer buffer = new StringBuffer("Namachivaya");

buffer.append("\t  Vaalga");

System.out.println(buffer);


//String builder - immutable in java 

StringBuilder builder = new StringBuilder("Naathan");

builder.append("Thaal Vaalga Amaan");

System.out.println(builder);




	}

	
	
}
