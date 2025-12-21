package Day10;

public class EmployeeExample {

	int empid;

	String  empname;

	String jobtitle;

	int salary;


	public void display() {


		System.out.println(empid);


		System.out.println(empname);

		System.out.println(jobtitle);

		System.out.println(salary);







	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// FIrst object 	
		
		EmployeeExample emp1 = new EmployeeExample();

		emp1.empid = 1001;

		emp1.empname = "Namachivaya";


		emp1.jobtitle = "Tester";

		emp1.salary = 5000;

		emp1.display();


//Second Object 
		

		EmployeeExample emp2 = new EmployeeExample();

		
		emp2.empid = 2001;

		emp2.empname = "Namachivaya2";


		emp2.jobtitle = "Tester2";

		emp2.salary = 50002;

		emp2.display();
		
		
		
		
	}

}