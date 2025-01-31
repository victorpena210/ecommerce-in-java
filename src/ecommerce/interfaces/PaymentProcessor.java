package ecommerce.interfaces;

public interface PaymentProcessor {
	
	int RETRY_ATTEMPTS = 5;
	
	void processPayment(PaymentData payment);
	
	default void someDefaultmethod() {
		System.out.println("this is the default method");
	}
	
	static void someStaticMethod() {
		System.out.println("This is the static method");
	}

}
