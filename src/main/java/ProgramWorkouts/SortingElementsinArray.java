package ProgramWorkouts;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sorting Numbers
		
int a[] = {90,80,30,12,4,2,1,500,300};

System.out.println("The array before sort"+Arrays.toString(a));


Arrays.sort(a);

System.out.println("The array after sort"+Arrays.toString(a));


		
//Sorting Strings 

String b[] =  {"Namachivaya", "Vaalga","Velga","Imai","Poluthum"};
 
System.out.println("The string array before sort"+Arrays.toString(b));

Arrays.sort(b);


System.out.println("The string array after sort"+Arrays.toString(b));





	}

}
