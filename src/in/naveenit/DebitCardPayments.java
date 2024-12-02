package in.naveenit;

public class DebitCardPayments  implements IPayment{

	public boolean ProcessPayment(double billAmt) {
		System.out.println(" Debit Card Payment process");
		return  true;
	}



}
