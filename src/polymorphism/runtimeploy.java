package polymorphism;

public class runtimeploy {

	public static void main(String[] args) {
	
		MacBook mac=new MacBookAir();
		mac.start();
		mac.shutdown();
}
}

class MacBook{
	void start() {
		System.out.println("macbook started..");
	}
	
	void shutdown() {
		System.out.println("macbook shutdown....");
	}
}

class MacBookAir extends MacBook {
	void start() {
		System.out.println("macbookAir started..");
	}
	
	void shutdown() {
		System.out.println("macbookAir shutdown....");
	}
}

class MacBookPro extends MacBook{
	void start() {
		System.out.println("macbookpro started..");
	}
	
	void shutdown() {
		System.out.println("macbookpro shutdown....");
	}
}