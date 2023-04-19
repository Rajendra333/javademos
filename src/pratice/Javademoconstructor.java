package pratice;
import pratice.Car;

public class Javademoconstructor {
	public int a;
	static {
		System.out.println("this is static block");
	}
	
	{
		System.out.println("this is non static block");
	}
 public static void main(String args[]) {
	 System.out.println("this is constructor");
	 Javademoconstructor jdc=new Javademoconstructor();
	 jdc.a=1;
	 System.out.println(jdc.a);
	Car car=new Car();
	System.out.println(car.wheels);
	System.out.println(Car.fuletype);
	 
	 
 }

 
}
