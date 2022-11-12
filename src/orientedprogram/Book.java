package orientedprogram;

public class Book {

	public String name ;
	public String color;
	public double price;
	
	
 

	public Book(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}

	String read() {

		return "the best book";
	}

	int price() {

		return 500;
	}
	
	

	
	
	
	public static void main(String[] args) {
		
		
		Book mybook = new Book("atomac","black", 3000);
		
		System.out.println(mybook.name);
		System.out.println(mybook.color);
		System.out.println(mybook.price);
		
		System.out.println(mybook.read());
		System.out.println(mybook.price());
	//	***********************************************
		System.out.println("*************************************");

		Book mybook1 = new Book("source","white", 3000);
		
		System.out.println(mybook1.name);
		System.out.println(mybook1.color);
		System.out.println(mybook1.price);
		
		System.out.println(mybook1.read());
		System.out.println(mybook1.price());
		
	}
}
