package orientedprogram;

public class Homework {

	public static void main(String[] args) {
		
		
		int even[] =     { 13, 25, 58, 42, 34, 27, 65, 18 };
	    int [ ] odd = { 23, 34, 21, 43, 98, 11, 16 };
	    
	        int sum = 0;
	    for(int i :even) {
	        if(i%2 == 0) {
	            sum += i;
	            
	        }
	        
	    }
	    
	    
	    int sum1 = 0;
	    for(int i :odd) {
	        if(i%2 != 0) {
	            sum1 +=i;
	            
	        }
	        
	    }
	    System.out.println(sum1+sum);
	}
		
	}


