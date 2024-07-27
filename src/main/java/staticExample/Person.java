package staticExample;

import java.awt.desktop.ScreenSleepEvent;

public class Person {
	
	  int x; 
	  static int y;
	  
	  
	  void increment () {
		  
		  x++;
		  y++;
		  System.out.println("The x value now is Non staic >>"+x);
		  System.out.println("The y value now is Static >>"+y);
		  
		  
	  }  
	  
	  
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Person pr = new Person();
pr.increment();
pr.increment();
System.out.println("Once again created object");
Person pr1 = new Person();
pr1.increment();
pr1.increment();


 PersonActivities.sleep();







	}

}
