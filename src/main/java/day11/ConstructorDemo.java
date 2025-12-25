package day11;

public class ConstructorDemo {

int x,y;


ConstructorDemo(){
	
	x=10;
	y=20;
	
}


 


ConstructorDemo(int a,int b){
	
	
	x = a;
	y=b;
	
	
}


public void sum() {
	
	System.out.println(x+y);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConstructorDemo dem = new ConstructorDemo();
 
				
				dem.sum();
				
				ConstructorDemo dem1 = new ConstructorDemo(100,200);
				dem1.sum();
				
		
		
		
		
	 

	}

}
