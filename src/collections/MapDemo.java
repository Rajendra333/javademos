package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String ,Integer>marks=new HashMap<>();
		marks.put("john", 50);
		marks.put("ravi", 50);
		marks.put("lee", 50);
		marks.put("don", 50);
		
		System.out.println(marks);
		
		System.out.println(marks.keySet());
		System.out.println(marks.values());
		
		for(String Key: marks.keySet()) {
			System.out.println(marks.get(Key));
			
		}
	}
	

}
