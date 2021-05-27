package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber = 35;
		int secondNumber = 23;
		
		int result = maxOf(firstNumber, secondNumber);
	
		maxOf(5);
		
	}

	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
	
	static void maxOf(float d) {
		
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning!");
	}
	
}
