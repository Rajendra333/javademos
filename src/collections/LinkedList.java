package collections;

import java.util.ArrayList;

public class LinkedList {
	public static void main(String[] args) {
    ArrayList<Integer> specvalues=new ArrayList<Integer>();
    int values[]= {2,3,4,5,6,9,10};
    
    for(int i=0; i<values.length;i++) {
    	specvalues.stream()
    	.filter(num -> num%2 ==0)
    	.forEach(System.out::println);
    }
	}
}
