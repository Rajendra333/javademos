package sortingalgorthems;

import java.util.Arrays;

public class BinarySearchDemo {
	public static void main(String[] args) {
int searchitem=9;
		
		int [] array= {99,88,9,8,7,89,90,4,3,2};
		System.out.println("Before Sorting "+Arrays.toString(array));
		long start=System.currentTimeMillis();
		Arrays.sort(array);
		System.out.println("After Sorting "+Arrays.toString(array));
		long end=System.currentTimeMillis();
		System.out.println("Time"+(end-start));
		int index=binarySearch(array,searchitem);
		if(index==-1) {
			System.out.println("Item"+searchitem+"not found");
		}else {
			System.out.println("Item "+searchitem+" found"+ index);
		}
	}

	 private static int binarySearch(int [] array,int searchitem) {
		 int firstindex=0;
		 int lastindex=array.length-1;
		 int middleindex=(firstindex+lastindex)/2;
		 
		 while(firstindex<=lastindex) {
			 if(searchitem>array[middleindex]) {
				 firstindex=middleindex+1;
			 }else if(searchitem == array[middleindex]){
				 return middleindex;
			 }else {
				 lastindex=middleindex-1;
			 }
			 middleindex=(firstindex+lastindex)/2;
		 }
		return 0;
		 
	 }
}
