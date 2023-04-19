package multithreading;

public class ChallengeDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) { 
				Utils.printmessage("printing main thread"+Thread.currentThread().getName()+"--"+i);
				
			}
		
		EvenNumber ev=new EvenNumber();
		Thread t1=new Thread(ev);
		t1.start();
		OddNumber od=new OddNumber();
		Thread t2=new Thread(od);
		t2.start();
}
	
}

class EvenNumber implements Runnable{
	
	

	@Override
	public synchronized  void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				Utils.printmessage("printing even number"+Thread.currentThread().getName()+"--"+i);
				
			}
	}
}
}
class OddNumber implements Runnable {

	

	@Override
	public synchronized  void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				Utils.printmessage("printing odd number"+Thread.currentThread().getName()+"--"+i);
			
			}
	}
}
}