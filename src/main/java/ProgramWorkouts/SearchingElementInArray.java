package ProgramWorkouts;

import java.util.Scanner;

public class SearchingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[] = { 10,20,30,40,50,60};

System.out.println("Enter Search Number");
		

int searchnum ;

boolean flag = false;

Scanner sc  = new Scanner(System.in);

searchnum = sc.nextInt();


for(int i =0;i< a.length;i++) {
	
if(a[i]== searchnum ) {
	
	
System.out.println("The number found in array");
flag = true;
break;
	
}
	
	


}



if(flag == false) {
	System.out.println("Number Not found In Array ");
	
		
		
		

	}

}
	
}
