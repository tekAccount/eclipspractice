package assignment;

public class TestAssignment {

	public static void main(String[] args) {
		
		
		int x =90;
		
		
		if (x>=90) {
			System.out.println("student is in A+");
			if (x <=80) {
				System.out.println("this student is in averge");
				if (x==59) {
					System.out.println("this student is good ");
				}
			}
		}
		
		else if( x<30 ){
		System.out.println("student faild");
		
		}
		
		else if (x<=55) {
			System.out.println("please get out of the college");
			
		}


}
}