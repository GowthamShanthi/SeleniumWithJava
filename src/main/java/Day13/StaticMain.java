package Day13;

public class StaticMain {


	void main(){


		StaticDemo.m1();



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		StaticDemo.m1();
		System.out.println(StaticDemo.a);

		StaticDemo dem = new StaticDemo();

		System.out.println(dem.b);

	}

}
