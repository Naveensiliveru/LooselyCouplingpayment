package in.naveenit;

public class PaymentService {
	
	
	 private  IPayment  payment;
	 
	  public PaymentService(IPayment payment) {
		   this.payment =payment;
		  
	  }
	  
	   public void doPayment( double billAmt) {
		    boolean status = payment.ProcessPayment(billAmt);
		   
		     if(status ) {
		    	 System.out.println("Printing Recipt");
		     } else {
		    	 System.out.println(" Payment Declined");
		     }
	   }

}
