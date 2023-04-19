package lambada;

import java.util.function.Function;

public class FunctionalDemo {
public static void main(String[] args) {
	Function<String, Integer>f1=s ->s.length();
	System.out.println("lenth of helo ="+f1.apply("Hello"));
}
}
