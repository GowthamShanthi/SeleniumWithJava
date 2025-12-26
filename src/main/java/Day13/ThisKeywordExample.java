package Day13;

import net.bytebuddy.asm.Advice.This;

public class ThisKeywordExample {
	
	int x = 90; // Class variables/ Instance Variables
	int y = 900;
	
	void setData(int x, int y) {
		
		this.x = x;
		this.y=y;
		
		
		}
	
	void display() {
		
		System.out.println(x+" " +y );
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThisKeywordExample exp = new ThisKeywordExample();
		
	 exp.setData(100, 200);
		
		exp.display();
		
		
		
		
		
	
		

	}

}
