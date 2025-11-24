package novemberConceptsRecap;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
int a[] = {1,2,3,5,6,7};


int sum1 = 0;

// add all the sum of numbers first 

for (int  i=0;i<a.length;i++ ) {
	
	
	sum1 = sum1 + a[i];
	
	}
	

//Add sume of all numbers in the range


int sum2 = 0;

for(int j=0;j<=7;j++) {
	
	
	sum2 = sum2+j;
	
}



System.out.println("Sum  of elements in array"+sum1);

System.out.println("Sum of all elements in range"+sum2);


int missingnum = sum2-sum1;


System.out.println("The missing number is"+ missingnum);
		
		
	}

}
