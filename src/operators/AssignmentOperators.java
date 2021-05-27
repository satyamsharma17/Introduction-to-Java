package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
	
	    int a = 4;
		
	    a &= 2; // 100 = 4
	            // 010 = 2
	            // 000 = 0
		a += 2; // a = 0 + 2 = 2
		a *= 2; // a = 2 * 2 = 4
		
		
		int b = 4;
		
		b |= 2; // 100 = 4
		        // 010 = 2
		        // 110 = 6
		b += 2; // b = 6 + 2 = 8
		
		int c = 6;
		
		c -= 2; // c = c - 2 = 4
		
		int d = 7;
		
		d -= 2; // d = d - 2 = 5
		
		int e = 4;
			
		e /= 2; // e = e / 2 = 2
			
		int f = 5;
			
		f *= 2; // f = f * 2 = 10
		
		int g = 8;
		
		g %= 6; // g = g / 6 (Reminder) = 2
		
		int h = 9;
		
		h >>= 1; // h = h / 2 (Integer) = 4 
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}

}
