package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraylistProblem1 {
	public static void main(String[] args) {
		List<String>names=new ArrayList<String>();
		System.out.println("Enter 5 Integers:");
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			String temp=sc.next();
			
			if(!names.contains(temp))
				names.add(temp);
		}
		Collections.sort(names);
		System.out.println(names);
	}

}
