package oopsassignment4;

public class Mainmethod {

	public static void main(String[] args) {
		Payement c = new Payement();
		c.setAmount(2000);
		CashPayment d = new CashPayment();
		d.paymentDetails();
		CreditCardPayment e = new CreditCardPayment("Sweta  Patel","09/23","234567891234");
		e.paymentDetails();
		CreditCardPayment f = new CreditCardPayment("Eva  Patel","09/23","234098891234");
		f.paymentDetails();
		

	}

}
