package multithreading;

public class RunnableDemo {
	public static void main(String[] args) {
		Utils.printmessage("Begain main method");
		
		ImageProcessor ip= new ImageProcessor();
		Thread t=new Thread(ip);
		t.start();
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Utils.printmessage("do some work....");
			}
			
		});
		
		
	}

}

class ImageProcessor implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printmessage("processing an image");
	}}