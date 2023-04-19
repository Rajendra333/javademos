package scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		//ScannerDemo1();
		ScannerDemo2();
		
}
	private static void ScannerDemo1() {
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number char to exit:");
		while(scanner.hasNextInt()) {
			int num=scanner.nextInt();
			sum+=num;
			System.out.println("enter a number char to exit:");
		}
		System.out.println("sum:"+sum);
	}
	

private static void  ScannerDemo2() {
	System.out.println("enter Student Details:");
	
	Scanner sc=new Scanner(System.in);
	int id =sc.nextInt();
	
	System.out.println("enter Student name:");
	String name=sc.next();
	
	System.out.println("enter Student score:");
	
	double score=sc.nextDouble();
	
	System.out.println("Student Details:");
	
	System.out.println("Id:" +id);
	
	System.out.println("name:" +name);
	
	System.out.println("score:" +score);
}

}