package lambada;

public class LambadaDemo {
	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		calc.calculate(20, 9);
		
		ICalculator multiply=new ICalculator() {

			@Override
			public int calculate(int a, int b) {
				// TODO Auto-generated method stub
				int result=a*b;
				System.out.println("Calculae "+"a"+""+b+"*"+"="+result);
				return result;
			
			}
			
		};
		multiply.calculate(2, 9);
		
		//lambada
		int x=15;
		int y=20;
		ICalculator divider=(a,b) ->{return x/y;};
		
	}

}

interface ICalculator{
	int calculate(int a, int b);
}

class Calculator implements ICalculator{

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		int result=a+b;
		System.out.println("Calculae "+"a"+""+b+""+"="+result);
		return result;
	}
	
}