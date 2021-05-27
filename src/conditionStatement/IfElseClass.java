package conditionStatement;
import java.util.Scanner;

public class IfElseClass {

public static void main(String[] args) {
 
	Scanner sc = new Scanner(System.in);{
	
		int noOfPetals = sc.nextInt();

//		int age = sc.nextInt();
		
//		if (age >= 18) 
			//block of code to be executed of the condition is true
//		{
//			System.out.println("You can vote now.");
//		}
//		else 
			//block of code to be executed of the condition is false
//		{
//			System.out.println("You can't vote now.");
//		}
		
		if (noOfPetals % 2 == 0) {
			System.out.println("She loves me not.");
		} else {
			System.out.println("She loves me.");
		}
		
		}
	
	}

}
