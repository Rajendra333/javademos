package operators;

public class Unaryoperator {
	
	void incremant() {
		int x=10;
		int y=20;
	   int result= x+y;
	   System.out.println("result value before increment:" +result);
	   ++ result;
	   System.out.println("result value preincrement:" +result);
	   result ++;
	   System.out.println("result value postincrement:" +result);
	}
	
	void decrement() {
		int x=10;
		int y=20;
	   int result= x+y;
	   System.out.println("result value before increment:" +result);
	   result --;
	   System.out.println("result value predecrement:" +result);
	   -- result;
	   System.out.println("result value postdecrement:" +result);
	}

	public static void main(String[] args) {
		Unaryoperator un =new Unaryoperator();
		un.incremant();
		un.decrement();
	}
}
