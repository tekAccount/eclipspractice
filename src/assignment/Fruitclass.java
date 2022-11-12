package assignment;

public class Fruitclass {
	
	
	String name;
	double baseprice;


	
	public Fruitclass(String name,double baseprice) {
		
		this.name=name;
		this.baseprice=baseprice;
	}
	
	
	
	
	
	
	
	
	

	
	

	public static void main(String[] args) {
		Fruitclass peachObject = new Fruitclass("Peach",3.30);
		
		
		
		System.out.println("Fruit " + peachObject.name + " with Price " + peachObject.baseprice);
		
		
		
//		
//	//	Fruitclass orangeObject = new Fruitclass();
//	//	orangeObject.name= "Orange";
//	//orangeObject.baseprice=2.10;
//		//orangeObject.quantity=3.41;
//		
//		double totalprice = orangeObject.gettotalprice();
//		
//		System.out.println("Fruit " + appleObject.name + " with Price " + appleObject.baseprice +"Total Price for " + appleObject.name + " is " + totalPrice);
//		
//		System.out.println("Fruit " + orangeObject.name + " with Price " + orangeObject.baseprice+"Total Price for " + orangeObject.name + " is " + totalPrice);
	}

}
