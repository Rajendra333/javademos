package exception;

import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
		multicatch();
	}	
	
/*	String s="";
	try {
		int i=Integer.parseInt(s);
		System.out.println("converted integer = "+i);
	}
	catch(Exception e) {
		System.out.println("String is empty enter a valid string");
	}
	*/
	private static void stringParserDemo() {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		try {
		int i=Integer.parseInt(s);
		System.out.println("Converted integer="+i);
		}catch(Exception e) {
			System.out.println("Exception occured"+e.getMessage());
		}
	}
public static void dividebyzero() {
	int a,b;
	float c,d;
	System.out.println("Enter number to divide....");
	Scanner scanner=new Scanner(System.in);
	a=scanner.nextInt();
	System.out.println("the first number entered"+a);
	System.out.println("enter one more number:");
	b=scanner.nextInt();
	System.out.println("the second number entered"+b);
		
	try {
		c=a/b;
		d=a%b;
		System.out.println(a+"/"+b+"="+c+",Reminder="+d);
				
	}catch(Exception e) {
		System.out.println("exception occured"+e.getMessage());
	}
		
}

public static void multicatch() {
	try {
		String  s="7.5";
		int i=Integer.parseInt(s);
		System.out.println("converted into Integer="+i);
		String s1="hello";
		System.out.println("converted into Integer="+s1.length());
		
	}catch(NumberFormatException nfe) {
		System.out.println("NumberFormatException occurred ."+nfe.getMessage());
	}catch(NullPointerException npe) {
		System.out.println("NullPointerException occurred ."+npe.getMessage());
	}
	catch(Exception e) {
		System.out.println("Exception occurred ."+e.getMessage()+e.toString());
		
	}
}
}
