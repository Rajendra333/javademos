package loops;

import java.util.Scanner;

public class whleloopexample1 {
	public static void main(String[] args) {
		/*
		 * Scanner s=new Scanner(System.in); int x=s.nextInt(); int sum=0; while(x<10) {
		 * sum=sum+x; x++; } System.out.println("sum"+sum);
		 */
		 Scanner s=new Scanner(System.in);
		 int x=s.nextInt();
		 while(x<=10) {
			 if(x%2==0) {
				 System.out.println(x);
			 }
			 System.out.println(x);
		 }
		
	}
}
