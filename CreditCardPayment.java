package oopsassignment4;

public class CreditCardPayment extends Payement{
	String name ; 
	String  expiration_date;
	String  credit_card_number;
	public CreditCardPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCardPayment(String name, String expiration_date, String credit_card_number) {
		super();
		this.name = name;
		this.expiration_date = expiration_date;
		this.credit_card_number = credit_card_number;
	}
	public void paymentDetails() {
		System.out.println("The payment using credit card no  " + credit_card_number );
		
	}

	

	}


