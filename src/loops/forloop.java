package loops;

import java.io.Serializable;
import java.util.Scanner;

public class forloop {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * for(int i=1;i<10;i++) { i=i+1; System.out.println(i);
		 * 
		 * }
		 */

	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();
	       if (N%2==0) {  
	           System.out.println(N + " Weird ");  
	       } else {  
	           System.out.println(N+ " Not Weird");  
	       }   
	    }
		
		

}
