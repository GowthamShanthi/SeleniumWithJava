package Day13;

public class StaticDemo {
	
static int a=10; //static variable
int b = 20; // non static variable 



static void m1() //static method 
{
	System.out.println("This is static method");
}

  void m2() //static method 
{
	System.out.println("This is non static method");
}
	
  
  
  // non statis method can access all the suffs diesctly, irrelevant of sttaic or non statc 
  
  void m3() {
	  
	  System.out.println(a);
	  System.out.println(b);
	  m1();
	  m2();
  }
	
  
  //Static method can  access static stuffs directly
  
  // Static method can access non statis stuffs using objects 
  
  
  
  static void m4() {
	  
	  System.out.println(a);
	  
	  StaticDemo dem = new StaticDemo();
	  
	  
	  System.out.println(dem.b);
	 m1();
	  
	  
	 dem. m2();
	  
	  
  }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		m1();
		
		
		/*
		System.out.println(b);// We cannot access because b is non static
		m2(); // We cannot access because m2 is non static 
		
		*/

	}

}
