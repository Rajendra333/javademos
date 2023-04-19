package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem2 {
	public static void main(String[] args) {
	ArrayList<Integer> integer=new ArrayList<Integer>();
	
		Scanner sc=new Scanner(System.in);
		while(true) {
			display();
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.println("Add integer");
			integer.add(sc.nextInt());
			System.out.println(integer);
			}
		else if(choice==2){
			System.out.println("Remove integer");
		int remove=sc.nextInt();
		if(integer.contains(remove)) {
			integer.remove(remove);
		}
		}else if (choice==3) {
			System.out.println("Display");
			System.out.println("list out all integer"+integer);
		}else if(choice==4) {
			System.out.println("Exit");
			break;
		}
	}
	}
	public static void display() {
		System.out.println("Choice your option:");
		System.out.println("1.Add");
		System.out.println("2.Remove");
		System.out.println("3.Display");
		System.out.println("4.exit");
	}

}
