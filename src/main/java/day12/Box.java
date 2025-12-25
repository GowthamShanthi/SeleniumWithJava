package day12;




public class Box {

//double width,height,depth = 100;

double width = 30;
double height = 70;
double depth = 100;

 
Box(){
	
	width=height=depth = 90;
}
 

Box( double w, double h, double d){
	
width = w;
height = h;
depth = d;


	
}
 

public void disp() {
	
	
	System.out.println(width+""+height+""+depth);
	
}

 

}


