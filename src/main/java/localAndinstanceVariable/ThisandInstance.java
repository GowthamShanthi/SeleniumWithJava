package localAndinstanceVariable;

public class ThisandInstance {
	
int b = 50;

public  void sum() {
	
	int a = 10;
	int b = 20;
	
 	System.out.println("The value of a is"+a);
	System.out.println("The value of local variable b is"+b);
	System.out.println("The value of instance variable b is"+this.b);
	
	
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThisandInstance th = new ThisandInstance();
		 th.sum();
		 
	
		 
		 
		// System.out.println("Tryingt to call instance variable by this"+b);

	}

}
