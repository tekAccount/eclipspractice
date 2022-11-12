package assignment;

public class AS {

	public static void main(String[] args) {
		
	
		
		String str= "test";
		
		str=str.replace('e', 'b');
		
		System.out.println(str);
		
		
		
		StringBuilder s1 =new StringBuilder("book");
		s1.replace(1,1 , "c");
		System.out.println(s1);
	}

}
