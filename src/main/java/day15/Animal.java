package day15;

public class Animal {


	Animal(){

		System.out.println("This is Animal");
	}

	String color = "white";
	
	Animal(String name){

		System.out.println("This is Animal "+name);
	}

	

	void eat ()

	{
		System.out.println("eating.....");
	}


}


class Dog extends Animal{


	Dog(){

		System.out.println("This is dog");
		
		 
	}

	
	Dog(String name){

		super(name);
		System.out.println("This is dog  "+ name);
		
	}
	String color = "black";


	void displaycolor() {

		System.out.println(super.color);
	}


	void eat () {

		super.eat();

		//System.out.println("Eating bread");
	}



}
