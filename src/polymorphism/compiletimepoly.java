package polymorphism;

public class compiletimepoly {
	public static void main(String[] args) {
		compiletimeploymorphism ctp=new compiletimeploymorphism();
		ctp.add(10, 20);
		ctp.add("x", "y");
		ctp.add(10, 20,30);
	}
}

class compiletimeploymorphism{
	
	void add(int a, int b) {
	int	result=a+b;
		System.out.println(result);
		
	}
	void add(int a, int b,int c) {
		int	result=a+b+c;
		System.out.println(result);
	}
	void add(String x, String y) {
		String	result=x+y;
		System.out.println(result);
	}
}
