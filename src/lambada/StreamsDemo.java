package lambada;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsDemo {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer>filterlist=list.stream().filter(i ->i%2==0).collect(Collectors.toList());
		System.out.println(filterlist);
		
		List<Integer>multiply2=list.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(multiply2);
		
		List<String> names=new ArrayList<>();
		names.add("MAX");
		names.add("MILLER");
		names.add("JOHN");
		names.add("COLLINS");
		List<String>UpperToLower=names.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
		System.out.println(UpperToLower);
		
		List<String> upper=names.stream().map(i ->i.toUpperCase()).collect(Collectors.toList());
		System.out.println(upper);
		
		Random random=new Random();
		List<Integer> numlist=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			numlist.add(random.nextInt(20));
		}
		
		
		
	}

}
