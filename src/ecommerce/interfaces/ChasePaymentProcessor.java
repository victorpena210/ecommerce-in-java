package ecommerce.interfaces;

public class ChasePaymentProcessor implements PaymentProcessor, PaymentValidator{


	@Override
	public void processPayment(PaymentData payment) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean validatePayment(PaymentData payment) {
		// TODO Auto-generated method stub
		return false;
	}

}
