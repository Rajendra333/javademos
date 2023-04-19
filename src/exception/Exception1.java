package exception;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {

		exceptiondemo();
		}
	
	public static void exceptiondemo() {
		String a,b;
		System.out.println("Enter String values....");
         Scanner sc =new Scanner(System.in);
          a=sc.next();
         System.out.println("user entered first String:"+a);
         b=sc.next();
         System.out.println("user entered second string:"+b);
         try {
        	 
        	String c=a+b;
        	System.out.println("first name and last name"+c);
         }catch(Exception e) {
        	 System.out.println("error occoured"+e.getMessage()+e.toString());
         }
		
	}

}
