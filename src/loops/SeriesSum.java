package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//for saving the result, we have to define a float variable!	
		
		float result = 0;
		
//this code block will only add all the values!
		
//		for (float i = 1; i <= n; i++) {
			
//			result += 1/i;
//		}

//		System.out.println(result);
		
//this for loop will add and subtract all the values alternatively according to even or odd input value!
		
		for (float i = 1; i <= n; i++) {
			
//this if condition is for subtraction sign before even input value!
			
			if (i % 2 == 0) {
				result -= 1/i;
			} 
			
//this if condition is for addition sign before odd input value!
			
			else {
				result += 1/i;
			}
		}
		
			System.out.println(result);
	}

}
