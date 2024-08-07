package arrayExample;

import java.util.Arrays;

public class FruitsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Array Declaration type1
		String[] fruits = {"Apple","Orange","Watermelon","Grapes"};
		
		System.out.println("The last fruits is>>"+fruits[3]);
		System.out.println("The total number of fruits is>> "+ fruits.length);
		System.out.println("Printing the whole array>>"+Arrays.toString(fruits));
		
		//System.out.println("Calling -1 in the array>> "+fruits[-1]);
	
		
		//Array Declaration type 2
		String[] fruits5 = new String[5];
		
		fruits5[1] = "Fruit1";

		fruits5[2] = "Fruit2";

		fruits5[3] = "Fruit3";

		fruits5[4] = "Fruit4";

		fruits5[0] = "Fruit5";
		
		System.out.println("Pring the whole fruits5 array"+Arrays.toString(fruits5));
		
	 
		
		

	}

}
