package assignment;

import java.util.Scanner;

public class Student {
	
	
	public void printFullName(String firstName, String lastName) {
		
		System.out.println(lastName+" "+firstName);
	}

	
	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		
		System.out.println("Please enter your first name");
	
		System.out.println("Please enter your last name");
	
			Student p1 = new Student ();
		p1.printFullName(name.nextLine(),name.nextLine());
		
		
		
		
		
		
		String str= "test";
		str.replace('t', 'a');
		System.out.println(str);
	}
}
