package abstraction;

public class Abstractiondemo {
	public static void main(String[] args) {
		BMW bmw=new BMWfour();
		bmw.acclerate();
		
		
	}

}

abstract class BMW{
	void start() {
		System.out.println("BMW started");
	}
	
	abstract void acclerate();
	
	}
class BMWthree extends BMW{

	@Override
	void acclerate() {
		// TODO Auto-generated method stub
		System.out.println("BMW three model");
	}

}

class BMWfour extends BMW{

	@Override
	void acclerate() {
		// TODO Auto-generated method stub
		System.out.println("BMW four model");
	}
	
}
