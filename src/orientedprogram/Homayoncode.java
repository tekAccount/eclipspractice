package orientedprogram;

public class Homayoncode {

	public static void main(String[] args) {
		
		

		String str = new String("test");
		// data-type identifier = new constructor of the class;
		
		
		Student1 st1 = new Student1();
		st1.age = 15;
		st1.firstName = "Jack";
		st1.lastName = "Ma";
		System.out.println(st1.firstName);
		System.out.println(st1.lastName);
		System.out.println(st1.age);
		
		// to call functions, you need name of the object.name-of-method()
	
		
		Instructor obj1 = new Instructor();
		Instructor obj2 = new Instructor("Anna", "Wilson");
		
		System.out.println(obj1.firstName);
		
		obj1.printFullName();
		obj2.printFullName();
		
		
		int res = obj2.sum(10, 10);
		
		System.out.println(res);
		
	}
		
	

}
