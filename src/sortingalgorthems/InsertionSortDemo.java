package sortingalgorthems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSortDemo {

	public static void main(String[] args) {
	
	
		List<Integer>numbers=new ArrayList<>();
		numbers.add(99);
		numbers.add(9);
		numbers.add(80);
		numbers.add(6);
		numbers.add(67);
		numbers.add(4);
		numbers.add(3);
		numbers.add(89);
		
			System.out.println("Before Sorting "+numbers);
			long start=System.currentTimeMillis();
			System.out.println("After Sorting "+InsertionSort(numbers));
			long end=System.currentTimeMillis();
			System.out.println("Time"+(end-start));
  }
		 static List<Integer> InsertionSort(List<Integer> numbers) {
			 for (int i=0;i<numbers.size();i++) {
				 if(numbers.get(i)<=numbers.get(0)) {
					   numbers.add(0, numbers.get(i));
					   numbers.remove(i+1);
						 }else if(numbers.get(i)<numbers.get(i-1)) {
							 for(int j=1;j<i;j++) {
								 if(numbers.get(i)<numbers.get(j)) {
									   numbers.add(j, numbers.get(i));
									   numbers.remove(i+1);
							 }
						 }
						 
					 }
				 
			 
	
			 }
			return numbers;
		 
		 }
	}
