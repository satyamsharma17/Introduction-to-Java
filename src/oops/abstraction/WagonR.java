package oops.abstraction;

public class WagonR extends Car {
	
	public void breaking() {
		System.out.println("WagonR is breaking!");
	}

	@Override
	public void accelerate() {
		System.out.println("WagonR is accelerating! ");
		
	}
}
