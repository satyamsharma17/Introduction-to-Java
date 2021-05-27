package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 13;
		
//                 X 1 0 1 0
//                 Y 1 1 0 1
		
// BITWISE AND ( & ) 1 0 0 0
		
		int c = a & b;
		int d = a | b;
//                X 1 0 1 0
//                Y 1 1 0 1 

// BITWISE OR ( | ) 1 1 1 1
		
//		int c = b >> 1;
		
//bits are changing their position in right direction by eliminating terminal digit..	

//		int d = c << 1;

//bits are changing their position in left direction by eliminating terminal digit..
		
		System.out.println(c);
		
		System.out.println(d);
	}

}
