package day16;

interface shape {
	
	int length = 10; // final and tatic by default 
	int width = 20; // final and tatic by default 
	
	void circle();
	 
}




 class test3 implements shape{
	test3 tst3 = new test3();
	
	public static void name() {
		
		test3 tst5 = new test3();
		
	 System.out.println(shape.length);
	 
	 System.out.println(tst5.length);
	}
	


	public void circle() {
		// TODO Auto-generated method stub
		
	}
 
	
	
	  
	 
}




public class InterfaceDemo implements  shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scenario#1
		
		InterfaceDemo cobj1 = new InterfaceDemo();
		cobj1.circle(); // btsract class from interface 
		cobj1.triangle();
		
		//accessing the variables - 2 ways - 
		
		
		//using interface name
		System.out.println(shape.length+ shape.width);
		
		//using object asusual 
 
		
		System.out.println(cobj1.length+cobj1.width);
		
		
		
	
	}
	
	
// From interface 
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("This is circle");
		
	}
	 
	
	
	// From own class 
	
	public void triangle() {
		// TODO Auto-generated method stub
		System.out.println("This is triangle");
		
	}
	

	
	 
	 

}
