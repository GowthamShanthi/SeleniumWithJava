package novemberConceptsRecap;

public class TwoDimensionalArray {



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Approach1


		int a[][] = new int [3][2];



		//Adding values

		a[0][0] = 1;
		a[0][1] = 2;


		a[1][0] = 3;
		a[1][1] = 4;


		a[2][0] = 5;
		a[2][1] = 6;



		//Approach 2 - declaration + Adding values 



		int b[][] = { {100,200},
				{300,400},
				{600,700}

		};


		//3) Find size of an array

		System.out.println("The number of rows in B array is"+b.length);


		System.out.println("The number of column in B array is"+b[0].length);



		//4) read single value from an array

		System.out.println("The first value in B array is"+b[0][0]	);



		//5 reading adata from 2d array using for loop 
		/*
for(int i=0;i<=b.length-1;i++) {



	{

		for(int j=0;j<=b[i].length-1;j++)

		{



System.out.print(b[i][j]+ "    " );


		}

		System.out.println();
	}


		 */

		// 6.Reading value from 2d array  - for each loop


		for (int[] arr : b) {

			for (int x : arr) {

				System.out.print(x+ "  ");


			}

			System.out.println();

		}





		// Reading value from 2 dimensional array




		for(int i =0;i<=b.length-1;i++) {


			for (int j=0;j<=b[i].length-1;j++)


			{


				System.out.print(b[i][j]+"  ");

			}

			System.out.println();



		}





	}







}


