package orientedprogram;

public class Student1 {
	
	String firstName;
	String lastName;
	int age ;
	
	
	public Student1 () {
		firstName = "";
		lastName = "";
		age = 0;
		
	}

	
	public Student1(String firstName,String lastName,int age) {
		
		this.firstName= firstName;
		this.lastName= lastName;
		this.age=age;
		
		
	}

	
	public String toString() {
		return "student ["+ firstName + " " + lastName+ " " + age + "]";
	}

}