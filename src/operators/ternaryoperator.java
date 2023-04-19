package operators;

public class ternaryoperator {
	public static void main(String[] args) {
		int a=100 , b=25, c=40,d=90 ,result;
		

		result=((a > c) ? (a > b) ? (a > d) ? a : c : d: (b > c)? (b > d)? b : d : c);
		System.out.println(result);
		
	}

}
