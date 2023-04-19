package sortingalgorthems;

import java.util.Arrays;

public class BubbleSortDemo {
 
	public static void main(String[] args) {
		int [] numbers= {99,88,9,8,7,89,90,4,3,2};
		System.out.println("Before Sorting "+Arrays.toString(numbers));
		long start=System.currentTimeMillis();
		System.out.println("After Sorting "+Arrays.toString(BubbleSort(numbers)));
		long end=System.currentTimeMillis();
		System.out.println("Time"+(end-start));
}
 static int[] BubbleSort(int[] array) {
	 for(int i=0;i<array.length;i++) {
		 for(int j=0;j<array.length-1;j++) {
			 if(array[j]>array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			 }
		 }
	 }
	return array;
	 
 }
 
}
