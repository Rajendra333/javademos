package inheritance;

public class multipleinheritance {
	public static void main(String[] args) {
		DesktopComputer dc=new DesktopComputer();
		dc.poweron();
	}

}

class ElecronicDevice {
	
	void poweron() {
		System.out.println("Device powered on");
	}	
}

/*class tv extends ElecronicDevice {
	
	void poweron() {
		System.out.println("tv Guided screen displayed ");
	}	
}*/

interface TV{
	public default void poweron() {
		System.out.println("tv Guided screen displayed");
	}
}

interface Monitor {
	public default void poweron() {
		System.out.println("black screen displayed");
	}
}
class DesktopComputer implements TV, Monitor{

	@Override
	public void poweron() {
		// TODO Auto-generated method stub
		Monitor.super.poweron();
	TV.super.poweron();
	}}