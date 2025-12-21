package ProgramWorkouts;

import java.util.Arrays;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[] = {4,2,1,5,3};
	
	System.out.println("Array Before Sort "+Arrays.toString(a));
	
	
	int n = a.length;
	
	System.out.println("The length of the array "+n);
	
	
	
	for(int i = 0;i<n-1;i++) //loop for no of passed
		
	{
		
		for(int j=0;j<n-1;j++)
			
		{
			if(a[j]>a[j+1])
			{
				int temp ;
				
				temp= a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				
				
				
			}
		}
	}
	
	
		
	System.out.println("Array After  Sort "+Arrays.toString(a));
	
	}

}
