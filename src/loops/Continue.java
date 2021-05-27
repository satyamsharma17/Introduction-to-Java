package loops;

public class Continue {

	public static void main(String[] args) {
		
//		for (statement1; statement2; statement3) {
//code block to be executed
//			if(condition) {
//				continue;
//			}
//		}
		
//continue skips the current executing loop and moves to next loop.
		
		for (int i = 1; i <= 100; i++) {
			
			if (i >= 40 && i <= 50) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
