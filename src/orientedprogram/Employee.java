package orientedprogram;

public class Employee {
	
	String name = "shaheera";
	public int age = 22;
	private static String CoLLage = "Harvard";
	
	public String showInfo() {
		// local variable
		
		String firstName = "shaheer";
	    String lastName ="ghanizada";
				
      return firstName + lastName;
	}
		
	public static void main (String[] args) {
		// object
		Employee theEmployee = new Employee();
		// call or invoke
		System.out.println(theEmployee.name);
		System.out.println(theEmployee.age);
		System.out.println(Employee.CoLLage);
		System.out.println(theEmployee.showInfo());
		
		
		
		
	}
		
		

	

}
