package day11;

public class Student {

	
int sid;
String sname;
char grade;


void printstudata() {
	
System.out.println(sid+" "+ sname + "  "+ grade);
	
	
}



void setstudata(int id, String name, char g) {
	

sid = id;
sname = name;
grade = g;


	
	
}



  Student(int id, String  name, char g ) {
	
	
	sid = id;
	sname = name;
	grade = g;

	
	
	// TODO Auto-generated constructor stub
}


  
  Student(){
	  
  }


	
	
}
