package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;




public class SetDemo {
 
	public static void main(String[] args) {
		randomdemo();
		System.out.println("printing started ");
  }
 
	private static void randomdemo() {
		Random obj=new Random();
		int x=obj.nextInt(10, 20);
		System.out.println(x);
	}
	/*
	public static void hashsetdemo() {
		Random obj1=new Random();
		List<Integer> list= new ArrayList<Integer>();
		for(int i=1; i<=10;i++) {
			list.add(obj1.nextInt(20));
		}
		System.out.println(list);
	}*/
}
