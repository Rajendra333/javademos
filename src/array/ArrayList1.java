package array;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		demo3();
	}
	
	private static void  demo1() {
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20,30);
		list.add("hello");
		System.out.println(list);
	}
	
	private static void  demoe() {
		ArrayList<String> newlist= new ArrayList<String>();
		newlist.add("10");
		newlist.add("hello");
		newlist.add("world");
		System.out.println(newlist);
	}
	
	private static void  demo3() {
		ArrayList<Integer> newlists= new ArrayList<Integer>();
for(int i=10;i<=200;i=i+11) {
	newlists.add(i);
}
System.out.println(newlists);
newlists.add(2,100);
System.out.println(newlists);
	}

}
