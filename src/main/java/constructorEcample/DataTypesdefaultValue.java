package constructorEcample;

public class DataTypesdefaultValue {
	
	int gh;
	
	
 public DataTypesdefaultValue(int a) {
	// TODO Auto-generated constructor stub
	 
	 this.a = a;
	  
}

 
 public DataTypesdefaultValue() {
	// TODO Auto-generated constructor stub
	 
	 this.a = 2000;
	  
}

 
int a;
String test;
byte age;
float weight ;
double height;
long phonenumber ;
 
short id;
char initial;
boolean liked ;

public void PrintDataTypeDefaultValue() {
	
System.out.println("The default valueof int is");

System.out.println("The default valueof String  is"+test);


System.out.println("The default valueof byte  is"+age);

System.out.println("The default valueof long  is"+phonenumber);



System.out.println("The default valueof short  is"+id);



System.out.println("The default valueof char  is"+initial);

System.out.println("The default valueof boolean  is"+liked);



}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 int ghy;
		 
 DataTypesdefaultValue lr = new DataTypesdefaultValue();
 lr.PrintDataTypeDefaultValue();

DataTypesdefaultValue lr2 = new DataTypesdefaultValue(100);
lr2.PrintDataTypeDefaultValue();





	}

}
