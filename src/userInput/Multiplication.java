package userInput;
import java.util.Scanner;

public class Multiplication {
	
	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
	
		double a = sc.nextDouble();
		double b = sc.nextDouble();
			
		double  multiplication = (a * b);
		System.out.println("The Multiplication of both the number is "+ multiplication);
			
//	    double a = sc.nextDouble();
//	    double b = sc.nextDouble();
		
	    double  divide = (a / b);
	    System.out.println("The divide of given data is "+ divide);
	
//	    double a = sc.nextDouble();
//	    double b = sc.nextDouble();
		
	    double  addition = (a + b);
	    System.out.println("The addition of given data is "+ addition);
	  
//	    double a = sc.nextDouble();
//	    double b = sc.nextDouble();
	    
	    double  subtraction = (a - b);
	    System.out.println("The subtraction of given data is "+ subtraction);
		}

	}