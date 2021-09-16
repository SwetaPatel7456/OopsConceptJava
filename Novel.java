package oopsassignment3;

public class Novel extends Books{
  String author;

public Novel(String author) {
	super();
	this.author = author;
		
}
@Override
public String toString() {
	return "Novel [author=" + author + ", isbn=" + isbn + ", title=" + title + "]";
}
public static void main(String[] args) {
	Novel m = new Novel("Ramdas");
	System.out.println(m.toString());
	
	
}

}
