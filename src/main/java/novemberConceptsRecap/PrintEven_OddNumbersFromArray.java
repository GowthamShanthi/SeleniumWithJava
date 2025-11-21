package novemberConceptsRecap;

public class PrintEven_OddNumbersFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
int a[] = {1,2,3,4,5,6};

		
int res = 0;


for (int i=0;i<a.length-1;i++)
{
	
	res = a[i]%2;
	
if(res ==0)
{
	System.out.println("The even numbers are"+ a[i]);
}

else 
	
{
	System.out.println("The odd number is "+a[i]);
}
	
}




//Advanced for loop

System.out.println("This is the even number array elemenst");
for (int i : a) {
	

	
if(i%2==0) {
	
	
	
	System.out.println(i);
	
}
	
	
}



System.out.println("This is the even number array elemenst");
for (int j : a) {
	

	
if(j%2==0) {
	
	
	
	System.out.println(j);
	
}
	


		
	}

}
