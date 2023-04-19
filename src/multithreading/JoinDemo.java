package multithreading;

import java.util.Scanner;

public class JoinDemo {
	public static void main(String[] args) {
		
		printmessage("Sum of first n number");
		printmessage("Enter Value");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		Calculator calc=new Calculator(n);
		calc.start();
		
	}
	private static void printmessage(String message) {
		System.out.println(Thread.currentThread().getName()+"--"+message);
    }
}

class Calculator extends Thread{
	int n;
	int sum;
	
	Calculator(int n){
		this.n=n;
	}
	
	public void run() {
		for(int i=1;i<=50;i++) {
		this.sum+=i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
