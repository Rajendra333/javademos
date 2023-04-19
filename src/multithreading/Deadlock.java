package multithreading;

public class Deadlock {
public static void main(String[] args) {
	FirstResource fr = new FirstResource();
	SecondResource sr =new SecondResource();
	ResourceWorker rw=new ResourceWorker(fr, sr);
	Thread t=new Thread(rw);
	t.start();
	
	sr.method1(fr);
	
	
}
}

class ResourceWorker implements Runnable{
	SecondResource sr;
	FirstResource fr;
	
	ResourceWorker(FirstResource fr,SecondResource sr){
		this.fr=fr;
		this.sr=sr;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		fr.method1(sr);
		
	}
	
}

class FirstResource {
	public synchronized void method1(SecondResource sr) {
		Utils.printmessage("Inside First Method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("Invoiking SecondResource.method2");
		sr.method2();
	}
	public synchronized  void method2() {
		Utils.printmessage("First Resource .method2");
	}
}

class SecondResource {
	public synchronized void method1(FirstResource fr) {
		Utils.printmessage("Inside Second Method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("Invoiking FirstResource.method1");
		fr.method2();
	}
	public synchronized  void method2() {
		Utils.printmessage("Second Resource .method2");
	}
}