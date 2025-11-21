package novemberConceptsRecap;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//1.Declaring an array


		//Approcah1
		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[3] = 30;
		a[4] = 40;
		a[2] = 50;


		//Approach 2, declaration and adding values to array 

		int b[] = {50,60,70,80,90};

		//3 - FInd size of an array 

		System.out.println("The size of the array is "+b.length);




		// 4 - read sing value of an array 

		System.out.println("The 5th value in array is"+ a[4]);


		System.out.println("The 3rd value of array is"+ a[4]);
		
		
		
//5 - Read multiple value in array - just print 
		
System.out.println("This is just printing array values"+ Arrays.toString(b));




// Read multiple values from array - Using for loop 


for(int i=0;i<=b.length-1;i++)
{
	
System.out.println("The Array value of "+i+"Postion is "+b[i] );
	
	
}



// Read multiple values from array - Using foreach loop



for (int j : b) {
	
	System.out.println("The Array value is" + j);
	
	
	
}
 

	}

}
