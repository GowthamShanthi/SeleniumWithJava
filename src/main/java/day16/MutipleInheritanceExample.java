package day16;

public   class MutipleInheritanceExample extends InterfaceDemo  implements I1,I2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MutipleInheritanceExample m1 = new MutipleInheritanceExample();
		System.out.println(I2.y);
		System.out.println(m1.x);
		System.out.println(m1.y);
		
		void m3();
		
		
		
		

	}

	public void m2() {
		// TODO Auto-generated method stub
		
		System.out.println("This is m2......");
		
	}

	public void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("This is m1......");
		
		
	}

}
