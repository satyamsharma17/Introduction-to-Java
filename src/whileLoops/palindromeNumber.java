package whileLoops;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		
//An integer is a palindrome  if the reverse of that number is equal to that original number.
		
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int temp = n;
	int reversedNumber = 0;
		while(temp>0) {
		
			int lastDigit = temp % 10;
			
			reversedNumber = reversedNumber * 10 + lastDigit;
			
			temp /= 10;
		}
	
			if(reversedNumber == n) {
				System.out.println(n + " is palindrome.");
			} else {
				System.out.println(n + " is not a palindrome.");
		}
			
	}

}
