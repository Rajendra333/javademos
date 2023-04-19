package innerclass;

public class Annynomis {
	public static void main(String[] args) {
		PrinterConnection con =PrintDriver.getConnection();
		con.print();
	}
}
	 class PrintDriver{
		static PrinterConnection getConnection() {
			PrinterConnection pc= new PrinterConnection() {

				@Override
				public void print() {
					// TODO Auto-generated method stub
					System.out.println("printing........");
				}			
			};return pc;
		}
	}
	


interface PrinterConnection{
	void print();
}
