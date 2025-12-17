package ProgramWorkouts;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int a[] = {22,43,76,2,14,90,4};


System.out.println("Array Before Sort"+Arrays.toString(a));
		

int n = a.length;


for(int i=0;i<n-1 ; i++) {
	
	
	
	for(int j=0;j<n-1;j++) {
		
		
if(a[j]  > a[j+1])
{
	
int temp;

temp = a[j];


a[j] = a[j+1];

a[j+1] = temp;








	
	
	
	
}
		
	}
}



System.out.println("The array after sort is"+Arrays.toString(a));

		
		

	}

}
