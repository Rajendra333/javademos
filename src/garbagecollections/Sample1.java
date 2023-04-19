package garbagecollections;

import multithreading.Utils;

public class Sample1 {
	public static void main(String[] args) {
		
		for (int i=1;i<1000;i++) {
			new Student(i);
		}
		System.gc();
	}

}

class Student{
	int id;
	
	Student(int id){
		this.id=id;
		
		Utils.printmessage("Student id is created "+id);
	}
	
	protected void finalize() {
		Utils.printmessage("Student id is destroyed"+id);
	}
}