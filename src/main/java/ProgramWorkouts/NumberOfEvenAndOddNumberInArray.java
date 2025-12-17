package ProgramWorkouts;

public class NumberOfEvenAndOddNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,5,8,10,15,20,25};
		
		int even =0;
		
		int odd = 0;
		
		
		System.out.println("The length of the array"+a.length);
		
		for(int i=0;i< a.length;i++ ) {
			
			if(a[i]%2==0) {
				even++;
			}
			
			else {
				odd ++;
			}
			
		}
		
		
		
		System.out.println("The number of even value is"+even);
		
		System.out.println("The number of even value is"+odd);
		
		
		
		
		
	}

}
