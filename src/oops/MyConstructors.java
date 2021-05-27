package oops;

class Vehicle {
	int wheels;
	int headLights;
	String color;
	
//	Default Constructor
	
	Vehicle() {
		
	}
	
	Vehicle(int wheels) {
		this.wheels = wheels;
		headLights = 2;
	}
	
	Vehicle(int wheels, String color) {
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}

public class MyConstructors {

	MyConstructors() {
		System.out.println("Object is now created.");
	}
	
	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4);
		Vehicle scooty = new Vehicle(2);
		
		Vehicle eRikshaw = new Vehicle(3, "yellow");
		
		Vehicle random = new Vehicle();
		
		System.out.println(random.wheels + " wheels and color is " + eRikshaw.color + ".");
 
	}

}
