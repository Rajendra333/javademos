package Encapsulation;

public class Encapsulationdemo {
	public static void main(String[] args) {
		Car car=new Car();
		car.setColour("blue");
		
		
		System.out.println(car.getColour());
		System.out.println(car.getNunofwheels());
		
		
	}

}

class Car{
	private String  colour;
	private int nunofwheels ;
	private boolean customisable;
	
	public static String Manfacturer ="Honda";
	
	public Car() {
		setNunofwheels(4);
		setColour("white");
		customisable = true;
	}

	public int getNunofwheels() {
		return nunofwheels;
	}

	public void setNunofwheels(int nunofwheels) {
		this.nunofwheels = nunofwheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		if(customisable);
		this.colour=colour;
	}
	
	/*public  String getClour() {
		return this.colour;
	}
	
	public int nunofwheels() {
		return this.nunofwheels;
		
	}*/
}
