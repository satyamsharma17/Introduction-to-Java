package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);		
//		int x = sc.nextInt();
//		double y = sc.nextDouble();	    
//		System.out.println(x);		
//		System.out.println(y);
		
//      String hello = sc.nextLine();
//      System.out.println(hello);
		
//		Scanner var = new Scanner(System.in);	
//		int principal = var.nextInt();
//		float rate = var.nextFloat();
//		int time = var.nextInt();		
//		float simpleInterest = (principal * rate * time) / 100;
//		System.out.println("The Simple Interest is "+ simpleInterest);

		Scanner sc = new Scanner(System.in);	
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();		
		float simpleInterest = (principal * rate * time) / 100;
		System.out.println("The Simple Interest is "+ simpleInterest);
	}

}