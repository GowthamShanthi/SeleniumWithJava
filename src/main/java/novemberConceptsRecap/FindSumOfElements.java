package novemberConceptsRecap;

public class FindSumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int a[] = {1,2,3,4,5};



int sum = 0;


for (int i=0;i<=a.length-1;i++)
	
{
	
	

	
	sum = a[i] + sum;
}
		
		


System.out.println("The sum of elements in array is"+ sum);
		


int sums =0;


for (int i : a) {
	
sums = sums +i;	

}




System.out.println("The sum of elements in  the array using enhanced for loop is"+ sums);






	}
	
	
	
	

	
	
	
// Enhanced For Loop

	
		
	
	
}
