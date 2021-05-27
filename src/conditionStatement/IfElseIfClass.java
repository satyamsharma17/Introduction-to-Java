package conditionStatement;
//import java.util.Scanner;

public class IfElseIfClass {
	
	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);{
		
//		int number = sc.nextInt();
	
//		if (number <= 10) {
//			System.out.println("Number is less than equals to 10");
//		} else if (number > 10 && number <=20 ) {
//			System.out.println("Number is greater than 10 and less than equals to 20");
//		} else if (number > 20 && number <= 30) {
//			System.out.println("Number is greater than 20 and less than equals to 30");
//		} else if (number > 30 && number <= 40) {
//			System.out.println("Number is greater than 30 and less than equals to 40");
//		} else if (number > 40 && number <=50 ) {
//			System.out.println("Number is greater than 40 and less than equals to 50");
//		} else if (number > 50 && number <= 60) {
//			System.out.println("Number is greater than 50 and less than equals to 60");
//		} else if (number > 60 && number <= 70) {
//			System.out.println("Number is greater than 60 and less than equals to 70");
//		} else if (number > 70 && number <= 80) {
//			System.out.println("Number is greater than 70 and less than equals to 80");
//		} else if (number > 80 && number <= 90) {
//			System.out.println("Number is greater than 80 and less than equals to 90");
//		} else if (number > 90 && number <= 100) {
//			System.out.println("Number is greater than 90 and less than equals to 100");
//		} 

//		(Ternary Operator)
//		variable = (condition) ? expressionTrue : expressionFlase;
	   
		int a = 150;
		int b = 18;
		
		int maxOfBothNumbers = 0;
		
//		if(a > b) {
//			maxOfBothNumbers = a;
//		} else {
//            maxOfBothNumbers = b;
//		}
		
//      if (condition1) {
			//block of code to be executed if condition1 is true
//		else if (condition2) {
			//block of code to be executed if condition1 is false and condition2 is true
//      } else {
			//block of code to be executed if condition1 is false and condition2  is false
//      }
//	}
		
     	maxOfBothNumbers = a > b ? a : b;
		
		System.out.println("Max of both numbers is " + maxOfBothNumbers); 
		}
//	}
}