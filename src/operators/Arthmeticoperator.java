package operators;

public class Arthmeticoperator {

	void Addition(){
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
	}
	void Substracion() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	void Multipication() {
		int d=10;
		int e=20;
		int f=d*e;
		System.out.println(f);
	}
	void division() {
		int g=10;
		int h=20;
		int i=g/h;
		System.out.println(i);
	}
	void mudolo() {
		int j=10;
		int k=20;
		int l=j%k;
		System.out.println(l);
	}
	public static void main(String[] args) {
		Arthmeticoperator arth=new Arthmeticoperator();
		arth.Addition();
		arth.division();
		arth.mudolo();
		arth.Multipication();
		arth.Substracion();
	}

}
