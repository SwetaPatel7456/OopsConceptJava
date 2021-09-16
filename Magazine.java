package oopsassignment3;

public class Magazine  extends Books{
  String type;

public Magazine(String type) {
	super();
	this.type = type;
}

@Override
public String toString() {
	return "Magazine [type=" + type + ", isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
}

public static void main(String[] args) {
	Magazine m = new Magazine("comedy");
	System.out.println(m.toString());
	
}
}

