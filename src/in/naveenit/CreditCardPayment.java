 package in.naveenit;

public class CreditCardPayment implements IPayment {

	public boolean ProcessPayment(double billAmt) {
		System.out.println(" CreditCard Payment Processed");
		return true;
	}

}
