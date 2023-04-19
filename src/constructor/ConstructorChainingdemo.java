package constructor;

public class ConstructorChainingdemo {
	public static void main(String[] args) {
		Childclass cc= new Childclass();
	}	
	}
	
class Superclass {
		int x;
		Superclass() {
			System.out.println("no args class constructor");
		}
		Superclass(int x){
			this.x=x;
			System.out.println("one arg super class");
			
		}
	}
class Childclass extends Superclass{
	Childclass(){
		this(10);
		System.out.println("no args child class constructor called");
	}
	Childclass(int y){
		super(y);
		System.out.println("one args child class called");
	}



}
