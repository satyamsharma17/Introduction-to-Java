package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
	
//		for (statement1; statement2; statement3) {
			//code block to be executed
//			if(condition)
//				break;
//		}
		
//break moves out of the loop and executed the next statement after the loop.
		
//this code block will skip number 35 and print all the value except 35!		
		
//		for (int i = 1; i <= 100; i++) {
//			if (i == 35) {
//				break;
//			}
//				System.out.println(i);
//		}

//this is an infinite loop, you just have to enter values until it break! 	
		
		Scanner sc = new Scanner(System.in);
		
		for( ; ; ) {
			int n = sc.nextInt();
			
			if (n < 0) {
				break;
			}
		}	
		
	}
	
}
