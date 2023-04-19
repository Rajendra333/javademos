package multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterFrameWorkDemo {
	public static void main(String[] args) {
		VedioProcesserTask[] tasks= {
				new VedioProcesserTask("Bank"),
				new VedioProcesserTask("Hotel"),
				new VedioProcesserTask("Office"),
				new VedioProcesserTask("HomeSecuriy")
				};
		ExecutorService newFixedThreadPool=Executors.newFixedThreadPool(4);
		for(VedioProcesserTask vptsk: tasks) {
			newFixedThreadPool.submit(vptsk);
			
		}
		newFixedThreadPool.shutdown();
	}

}

class VedioProcesserTask implements Runnable{

	String sourceName;
	
	public VedioProcesserTask(String source) {
		this.sourceName=source;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printmessage("processing vedio from"+sourceName+"Started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("processing vedio from"+sourceName+"Ended");
	}
	
}