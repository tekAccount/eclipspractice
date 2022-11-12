package com.a;

public class Runner12 {

	public static void main(String[] args) {
		
		 Customer sg = new  Customer("ahmad", "123456","10045asdf", "ahmad@gmail.com", 20000, "1/2/2000",
					"0000", 12345);
		
		 
		 System.out.println(sg);
          sg.checkBalance("0000");
          sg.deposit(1000, 12345, "0000");
          
	}

}

