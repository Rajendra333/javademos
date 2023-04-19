package multithreading;

public class ThreadingDemo {
  public static void main(String[] args) {
	  
	  MultiThread mt=new MultiThread();
	  mt.start();
	  SingleThread st=new SingleThread();
	  st.PrintNumbers();
	  
}
}


class SingleThread{
	void PrintNumbers() {
		for(int i=1;i<=50;i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}

class MultiThread extends Thread{
	 public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}