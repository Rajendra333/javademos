package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//sumOfEvenInArray();
		chararray();

	}	/*int[] arr = {3,5,4,5,6,3,5,7};
			System.out.println("The given array is :");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+",");
			}
			for(int i=1;i<arr.length;i++) {
				if(arr[i-1]==3 && arr[i]==5) {
					arr[i]=0;
				}
			}
			System.out.println();
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+",");
			}
	
		*/
	
	
	
	private  static void sumOfEvenInArray() {
		int a[]= {3,0,4,5,6,3,0,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
		}
			  System.out.println(sum);
		}
		
}
	
	private static void chararray() {
		char[]c= {'a','z','b','q'};
		String s1="hello world",res="";
		
		for(char x:s1.toCharArray()) {
			System.out.println(x);
			res=x+res;
			System.out.println(res);
		}
		System.out.println("Reverse String :"+res);
		
String s="tap";
		
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}