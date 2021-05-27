package nestedForLoops;

public class NestedForLoop {

public static void main(String[] args) {
		
//	for (statement1; statement2; statement3) {
//code block to be executed in loop1
//		for (statement1; statement2; statement3) {
//code block to be executed in loop2
//		}
//	}
	
		for (int j = 1; j<=5; j++) {
			for(int i = 1; i<=10; i++) {
				System.out.print(i+" ");
			}
					System.out.println();
		}		
		
	}

}



