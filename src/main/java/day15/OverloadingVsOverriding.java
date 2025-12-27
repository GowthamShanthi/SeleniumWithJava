package day15;



class ABC{
	
	
	void m1(int a ) {
		
	 System.out.println(a);
		
	}
	
	void m2(int b ) {
		
		 System.out.println(b);
			
		}
	
	 
}


class XYZ extends ABC{
	
	void m1(int a ) // Overriding 
	
	{
		
		 System.out.println(a*a); 
			
		}
	
	void m2(int b ) // Overriding 
	
	{
		
		 System.out.println(b*b);
			
		}
	
	
	void m2(int a , int b) // overloading 
	
	{
		System.out.println(a+b);
		
	}
	
	
}


public class OverloadingVsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XYZ xobj = new XYZ();
		
		xobj.m1(10);
		xobj.m2(5);
		xobj.m2(10, 30);
		
	}

}
