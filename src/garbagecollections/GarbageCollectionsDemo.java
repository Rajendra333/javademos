package garbagecollections;

import java.util.ArrayList;

import multithreading.Utils;

public class GarbageCollectionsDemo {
	public static void main(String[] args) {
	//	ArrayList<House>house=new ArrayList<>();
		for(int i=1;i<=1000;i++){
	//		house.add(new House(i));
			new House(i);
		
		}
		
		System.gc();
	}

}

class House{
	int id;
	House(int id){
		this.id=id;
		Utils.printmessage("House created -"+id);
	}
	
	 	protected void finalize() throws Throwable{
	 		Utils.printmessage("House Destroyed -"+id);
	 	}
}
