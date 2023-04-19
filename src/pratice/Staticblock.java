package pratice;

public class Staticblock {
public static void main(String args[]) {
	System.out.println("this is main method");
	 {
		 System.out.println("this is non static block");
	 }
	
}
 static {
	 System.out.println("this is static block");
 }

}
