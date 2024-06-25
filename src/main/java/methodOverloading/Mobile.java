package methodOverloading;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Mobile mb = new Mobile();
mb.makecall(9600486615L);
mb.makecall("V.Gowtham");
mb.makecall("ShanthiV", 9994260457L);

	}
	public void makecall(long contactnumber) {
		
		System.out.println("The contact number is"+contactnumber);
		
	}
	
	public void makecall(String contactname) {
		System.out.println("The contact name is"+contactname);
		
	}
	
	public void makecall(String contactname,long contactnumber ) {
		
		System.out.println("The contact number is"+contactnumber);
		System.out.println("The contact name is"+contactname);
		
	}

}
