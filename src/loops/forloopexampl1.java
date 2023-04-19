package loops;

import java.util.Scanner;

public class forloopexampl1 {

	public static void main(String[] args) {
		/*
		 * for(int i=1; i<=10;i++) { if(i%2==0) { System.out.println(i); } }
		 */
		/*
		 * Scanner sc=new Scanner(System.in); int sum=0; for(int i=0;i<=10;i++) {
		 * System.out.println("enter number:"); sum=sum+sc.nextInt();
		 * 
		 * } System.out.println("sum is"+sum);
		 */

		/*
		 * Scanner sc=new Scanner(System.in); int s=sc.nextInt();
		 * 
		 * for (int i = 1; i <= s; ++i) { for (int j = 1; j <= i; ++j) {
		 * System.out.print("* "); } System.out.println(); }
		 */

		/*Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		for (int i = 1; i <= s; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j+"");
			}
			System.out.println();*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int s = sc.nextInt();
		for (int i = s; i >=1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		
		}

	}

}
