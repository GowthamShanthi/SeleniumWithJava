package novemberConceptsRecap;

public class MinandMaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int  a[] = {5,23,56,87,3,22,44};


// Find max value in array 


int max = a[0];




for(int i=0 ;i<a.length-1;i++) {
	
	
	
if(a[i]> max)
{
	
	
max = a[i];
	
}
}



System.out.println("The maximum number in the array is"+ max);
		
		
	





	}

}
