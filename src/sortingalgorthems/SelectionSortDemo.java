package sortingalgorthems;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int [] numbers= {99,88,9,8,7,89,90,4,3,2};
		System.out.println("Before Sorting "+Arrays.toString(numbers));
		long start=System.currentTimeMillis();
		System.out.println("After Sorting "+Arrays.toString(SelctionSort(numbers)));
		long end=System.currentTimeMillis();
		System.out.println("Time"+(end-start));
	
   }
	static int[] SelctionSort(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			int indexOfSmallest=i;
			for(int j=i;j<array.length;j++) {
				if(array[j]<array[indexOfSmallest]) {
					indexOfSmallest=j;
				}
					int temp=array[i];
					array[i]=array[indexOfSmallest];
					array[indexOfSmallest]=temp;
			}
		}
		return array;
	
		
	}
}
