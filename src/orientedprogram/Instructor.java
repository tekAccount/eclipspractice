package orientedprogram;

public class Instructor {
	
	
	
	// variables
	
	String firstName;
	String lastName;

	// constructors
	// default - when you dont have arguments
	
	public Instructor () {
		firstName= "";
		lastName = "";
		
	}
    
	// parameterized constructor - when you have arguments
	
      public Instructor(String fName, String lName) {
    	  
    	  firstName=fName;
    	  lastName=lName;
    	  
      }
	
      
      
      // print name if this format lastname, firstname
      
      public void printFullName() {
    	  System.out.println(lastName + "," + firstName);
    	  
      }
      
      
	public int sum(int a, int b ) {
		
		return a + b;
		
	
		// definition of method - everything before the body
		// implementation of a method - the body method
		// signature of a method - name and args 
		// parameters/argument of a method- args- what goes inside parenthesis
		//return of a method - depends to return type of your method.
		//if void, you dont return anything 
		// if any other data type, you must have a return statement 
		
		// what is input to a method and what is output of a method
		// input = args 
		// output = either something that the function will do, like printing something 
		// or returning something 
		
		
		
		
		//construction vs methods
		// construction will never have return types 
		// construction name must match the name of the class
		// methods must have return data-type 
		// methods does not have to have the class name 
		
		
		// both must have unique signature within the same scope 
		
		
		
		
	}
}
