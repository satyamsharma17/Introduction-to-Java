package conditionStatement;

public class NestedIfElse {

	public static void main(String[] args) {
	
		    int a = 12, b = 158, c = 100;
		    int result = 0;
		    
//		    if (condition1) {
		    	//block of code to be executed if condition1 is true
//		    	if (condition2) {
		    	//block of code to be executed if condition1 and condition2 are true
//		    	} else {
		    	//block of code to be executed if condition1 is true and condition2 is false
//		    }
//		}
		   
		    if (a > b) {
		    	if (a > c) {
		    		result = a;
		    	} else {
		    		result = c;
		    	} 
		    } 
		    else {
		    	if (b > c) {
		    		result = b;
		    	} else {
		    		result = c;
		    	}
		    }
		    
		    result = a > b ? a > c ? a : c : b > c ? b : c;
		    
	    System.out.println("Largest of the three number is " + result);
	}
}
