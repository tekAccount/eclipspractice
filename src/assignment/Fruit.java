package assignment;

public class Fruit {

	String name3;
	double baseprice;
	
	public Fruit () {
		this.name3="";
		this.baseprice=0;
			
	}
	
	public Fruit (String name3,double baseprice) {
		
		this.name3=name3;
		this.baseprice=baseprice;
	}
	
	  public void printInfo() {
		  
		  System.out.println("Fruit: "+name3+"  with Price"+  baseprice);
		  
	  }

	public static void main(String[] args) {
		
		Fruit appleObject = new Fruit("Apple", 3.10);
		Fruit orangeObject= new Fruit("Orange",2.10);
		appleObject.printInfo();
		orangeObject.printInfo();
		
		
		
	}
}