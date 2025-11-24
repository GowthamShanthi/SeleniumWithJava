package novemberConceptsRecap;

public class HowmanyTimesNumberRepeatedInArray {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		
		
int a[] = {12,34,34,34,5,6,78,90,90,};


int numbertocount = 34 ;



int counter =0;




for(int i=0;i<a.length;i++) {
	
	
if(a[i] == numbertocount )
	
{
	
	counter ++;
}
	
		
	
}
		

System.out.println("The number of time the "+numbertocount+ "Present  is"+counter);

		
		
	}

}
