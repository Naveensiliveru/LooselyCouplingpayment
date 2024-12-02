package in.naveenit;

public class APPTest {

	public static void main(String[] args) {
		 IPayment p = new DebitCardPayments();
	PaymentService service = new PaymentService(p);
		service.doPayment(500.00);	

	}

}
