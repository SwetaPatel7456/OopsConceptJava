package oopsassignment1;


public class Books {
	
	int isbn; String title; String author; static int  price;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void displaydata() {
		System.out.println("isbn  :" + isbn  +  " title :" +  title + "  author: " + author + " price: " + price);
	}
	public static int discountedprice(int d) {
		int newprice = price - (price*d)/100;
		return newprice;
	}
	public Books(int isbn, String title, String author, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public static void main(String[] args) {
		
		Books b = new Books(10,"python","Ramu",300);
		b.displaydata();
		System.out.println("The discounted price is " + discountedprice(10)) ;
	}

}
