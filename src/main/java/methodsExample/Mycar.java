package methodsExample;

public class Mycar {

	public static void main(String[] args) {
		// TODO Auto-generated 

		Car cr = new Car();
		String carname = 	cr.carname();
		System.out.println("The carnameis "+carname);
		
		boolean servicereached = cr.isservicemonthrecahed();
		System.out.println("Is sevice monthe reached"+servicereached);
		
		System.out.println("Thefamrange is"+cr.fmrange);
		System.out.println("The service monthe is "+cr.servicemonth);


	}

}
