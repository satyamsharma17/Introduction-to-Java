package operators;

public class LogicalOperators {

	public static void main(String[] args) {

		int number = 44;
		if (number >= 1 && number <=100) {
			System.out.println("Number is in the Range.");
//		}
//   	&& || ! are three logical operators.	
//		In AND &&: Result is 1, If both BIT are 1 and 1.
//		In AND &&: Result is True, If both BIT are True and True.
//		In OR ||: Result is 1, If anyone BIT is 1.
//		In OR ||: Result is True, If anyone BIT is True.
//		NOT ! is used to revert the condition result.
//		Ex: True = !False
		
		int grade = 11;
		if (!(grade == 12 || grade == 10)) {
			System.out.println("You can not give Board Exam!"); }
		}

	}
	
}