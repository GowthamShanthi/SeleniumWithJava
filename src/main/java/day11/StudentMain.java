package day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Assign value to variables using object reference variable



 
		Student std = new Student();



		std.sid = 101;
		std.sname = "Namachivaya";

		std.grade = 'A';


		std.printstudata();



		//2. Assign value by using user define method 

		std.setstudata(100, "Vaalga", 'G');

		std.printstudata();
		
		
		//Using constructor 
 
		
		Student std1 = new Student(90,"Vaalga", 'B');
		
	 
		std1.printstudata();
		
		










	}

}
