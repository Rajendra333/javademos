package innerclass;

import innerclass.ElectronicDevice.chip;

public class InnerClass {
	public static void main(String[] args) {
		ElectronicDevice ed=new ElectronicDevice();
		ed.poweon();
		ElectronicDevice.chip.displayBrand();
		ElectronicDevice.chip ch=new ElectronicDevice.chip();
		ch.spec();
		ElectronicDevice laptop=new ElectronicDevice();
		laptop.poweon();
	
		
	}

}

class ElectronicDevice{


	static void poweon() {
		System.out.println("power on......");
	}
	
	static class chip {
		static void displayBrand() {
			System.out.println("sony........");
		}
		
		void spec() {
			System.out.println("electronic device.....");
		}
	}
}
   class Processer{
	   void getVoltage() {
			System.out.println("voltage method");
		}
		
	 static void displayProBrand() {
			System.out.println("displayProBrand method.");
		}
		
	}


