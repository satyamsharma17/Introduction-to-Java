package oops.interfaces;

public class Person implements Student, YouTuber{

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
		YouTuber obj2 = obj;
		obj2.editVideo();
		obj2.makeVideo();
		
	}
	
	@Override
	public void study() {
		System.out.println("Person is studying!");
	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making a good video!");
	}

	@Override
	public void editVideo() {
		System.out.println("YouTuber is editing!");
	}
	
	public void uploadVideo() {
		
	}

}
