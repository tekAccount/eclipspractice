package orientedprogram;

public class Car {

	String name ;
	String color ;
	String model ;
	double price ;
	
	
	
	public Car (String name,String color,String model, double price) {
		
     this.name=name;
	 this.color=color ;
	 this.model=model;
	 this.price=price;
	
	}

	String gassUsage() {
		return "jeeps use 10 gallon per 100";

	}

	String speed() {
		return "run 250 MPH";
	}

	public static void main(String[] args) {
		// name of our class+ a name for your object + = + new + constructor();
		Car mycar = new Car("bmw","Black" ,"TA",10000);
	
		System.out.println(mycar.name);
		System.out.println(mycar.color);
		System.out.println(mycar.price);
		System.out.println(mycar.model);
		System.out.println(mycar.gassUsage());
		System.out.println(mycar.speed());
		
		
		System.out.println("******************************* \n");

		
		Car yourcar = new Car("cadidlac","white" ,"va",100000);

		System.out.println(yourcar.name);
		System.out.println(yourcar.color);
		System.out.println(yourcar.price);
		System.out.println(yourcar.model);
		System.out.println(yourcar.gassUsage());
		System.out.println(yourcar.speed());
		
		
		System.out.println();
		
		
		Car  mecar = new Car("corolla","gary","tr", 40000);
		

		System.out.println(mecar.name);
		System.out.println(mecar.color);
		System.out.println(mecar.price);
		System.out.println(mecar.model);
		System.out.println(mecar.gassUsage());
		System.out.println(mecar.speed());
		
	}

}
