package orientedprogram;

public class MethodPractice {

	// access modifier + data-type+ a name for our method (name should be a a verb)+
	// parentheses+ curly braces

	private int sumnumbers() {
		return 20 + 40;

	}

	public void getInfo() {

		System.out.println("this is me");
	}
	
	
	public int shownumbers(int num1 ,int num2) {
		int a = num1;
		int b = num2;
		 return a  +  b;
	}
	
	
	
	String showdetials(String firstname , String lastname) {
		 String a = firstname;
		 String b = lastname;
		 return a +", " +b;
	}

	public static void main(String[] args) {

		MethodPractice themethod = new MethodPractice();

		System.out.println(themethod.sumnumbers());
		themethod.getInfo();
		
		System.out.println(themethod.shownumbers(100, 200));
		
		System.out.println(themethod.showdetials("shaheera" , "zarif"));
	}
}
