package array;

public class ArraySample1 {
	public static void main(String[] args) {
		int[] a=new int[] {3,9,88,27};
		int max=a[0];
		System.out.println("the given array is:");
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			max=a[i];
		}
				System.out.println(max);
		
		
		
	}

}
