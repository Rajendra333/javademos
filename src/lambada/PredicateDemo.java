package lambada;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
	/*	Predicate<Integer>g10=(i) -> (i>10);
		int[]x= {10,20,30,40};
		m1(g10,x);
		
	}
	
	static void m1(Predicate<Integer>p,int[] x) {
		for(int i: x) {
			if(p.test(i));{
			System.out.println(i);
			}
		
	}*/

		Predicate<Integer> array=(i)->(i%2==0);
        int[] x= {1,2,3,4,5,6,7,8,9,10};
        m1(array,x);
        
        Predicate<Integer> gt5=(i) -> (i>5);
        Predicate<Integer>isEven=(i) ->(i%2==0);
        
        int y[]= {1,2,3,4,5,6,7,8,9,10};
        m1(gt5.and(isEven),y);
}
static void m1(Predicate<Integer> p,int[] x) {
	for(int i:x) {
		if(p.test(i)) {
			System.out.println(i);
		}
	}
}
}
