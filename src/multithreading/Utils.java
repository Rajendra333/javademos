package multithreading;

public class Utils {
	public static void printmessage(String message) {
		System.out.println(Thread.currentThread().getName()+"--"+message);
    }
}
