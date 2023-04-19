package garbagecollections;

public class EnumsDemo {
	public static void main(String[] args) {
		PaymentType pt= PaymentType.DEBITCARD;
		System.out.println(pt);
		PaymentType pt1= PaymentType.LOAN;
		System.out.println(pt1);
		
		PaymentType [] values=PaymentType.values();
		for(PaymentType paymenttype: values) {
	
			System.out.println(paymenttype);
			System.out.println(paymenttype.ordinal());
			System.out.println(paymenttype.getfee());
			
		}
	}

}

enum PaymentType{
	DEBITCARD(5),
	CREDITCARD(10),
	CASH(78),
	LOAN(46);
	
	int fee;
	int num;
	PaymentType(int fee){
		this.fee=fee;
		
	}
	
	public int getfee() {
		return this.fee;
		
	}
}